package com.softtek.web.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;


public class UtilGIT {
	private String treeView = null;
	private List<String> conflictedFiles = null;
	private String uploadSelectedFile = null;
	
	public String uploadTreeView(String pathDirectoryProject, List<String> conflictedFiles, String uploadSelectedFile) {
		File folder = null;
		this.treeView = "";
		this.conflictedFiles = conflictedFiles;
		if( uploadSelectedFile != null && !uploadSelectedFile.isEmpty() ) {
			this.uploadSelectedFile = uploadSelectedFile.replace("\\", "\\\\");
		}
		
		System.out.println("Iniciando executorCloneBASH(...)");
		folder = new File(pathDirectoryProject);
		
		this.printFile(folder, "");		
		System.out.println("Finalizando executorCloneBASH(...)");
		
		return treeView;
	}
	
	private void closeBufferedReader(BufferedReader br) {
		try {
			if (br != null)
				br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void printFile(File file, String tab) {
		if( file.isDirectory() ) {
			File[] listOfFiles = file.listFiles();
			//System.out.println(tab + ">" + file.getName());
			treeView += "<li onclick=\"displayUL();\"><span class=\"caret\">"+file.getName()+"</span>"+"\n";
			treeView += "<ul class=\"nested\">"+"\n";
						
			for( File f : listOfFiles ){
				if( f.isDirectory() ) {
					printFile(f, tab + "  ");
				}else {
					//System.out.println(tab + "  -" + file.getPath() + f.getName());
					if( this.isConflictedFile(file.getPath().replace("\\", "\\\\")+"\\\\"+f.getName()) ) {
						treeView += "<li><a onclick=\"loadSelectedFile('"+file.getPath().replace("\\", "\\\\")+"\\\\"+f.getName()+"')\" href=\"#\" style=\"color: red;\">"+f.getName()+"</a></li>"+"\n";
					}else {
						if( isSelectedFile(file.getPath().replace("\\", "\\\\")+"\\\\"+f.getName()) ){
							treeView += "<li><a onclick=\"loadSelectedFile('"+file.getPath().replace("\\", "\\\\")+"\\\\"+f.getName()+"')\" href=\"#\" style=\"color: #900C3F;\">"+f.getName()+"</a></li>"+"\n";
						}else {
							treeView += "<li><a onclick=\"loadSelectedFile('"+file.getPath().replace("\\", "\\\\")+"\\\\"+f.getName()+"')\" href=\"#\">"+f.getName()+"</a></li>"+"\n";
						}
					}					
				}
			}
			
			treeView += "</ul>"+"\n";
			treeView += "</li>"+"\n";
		}
	}
	
	private boolean isSelectedFile(String file) {
		boolean eureka = false;
		
		if( this.uploadSelectedFile != null ) {
			if( file.equals(uploadSelectedFile) ) {
				System.out.println("file: " + file + "\t uploadSelectedFile: " + uploadSelectedFile);
				eureka = true;
			}
		}
		
		return eureka;
	}
	
	private boolean isConflictedFile(String file) {
		boolean eureka = false;
		
		if( this.conflictedFiles != null ) {
			for( String f : this.conflictedFiles ) {
				if( f.equals(file) ) {
					eureka = true;
					break;
				}
			}
		}
		
		return eureka;
	}
	
	public String executorCloneBASH(String urlClone, String pathDirectoryProject, String pathLogFile) {
		Runtime runtime = Runtime.getRuntime();
		String msgClone = "";
		
		try {
			System.out.println("Iniciando executorCloneBASH(...)");
			
			Process p1 = runtime.exec("cmd /c start C:/Users/javier.perezb/Desktop/cloneGit.sh " + urlClone + " " + pathDirectoryProject + " " + pathLogFile);
			msgClone = this.validateLogExecution(pathLogFile, "cloneEndFileLog.txt");
			System.out.println("****msgClone: " + msgClone);
			
			System.out.println("Finalizando executorCloneBASH(...)");		    
		} catch(IOException ioException) {
			ioException.printStackTrace();
		}
		
		return msgClone;
	}
	
	public String executorPullBASH(String pathDirectoryProject, String pathLogFile) {
		Runtime runtime = Runtime.getRuntime();
		String msgPull = "";
		
		try {			
			System.out.println("Iniciando executorPullBASH(...)");
			
		    Process p1 = runtime.exec("cmd /c start C:/Users/javier.perezb/Desktop/pullGit.sh " + pathDirectoryProject + " " + pathLogFile);
		    msgPull = validateLogExecution(pathLogFile, "pullEndFileLog.txt");
						
			System.out.println("Finalizando executorPullBASH(...)");
		} catch(IOException ioException) {
		    System.out.println(ioException.getMessage() );
		} catch(PatternSyntaxException pse) {
			pse.printStackTrace();
		}		
		
		return msgPull;		
	}

	public String executorPushBASH(String pathDirectoryProject, String pathLogFile, String urlClone, String email, String user, String pass) {
		Runtime runtime = Runtime.getRuntime();
		String msgPush = "";
		
		try {			
			System.out.println("Iniciando executorPushBASH(...)");

			String[] tempUrlClone = urlClone.split("//");
			String urlCloneGIT = tempUrlClone[0] + "//" + user + ":" + pass + "@" + tempUrlClone[1];
		    Process p1 = runtime.exec("cmd /c start C:/Users/javier.perezb/Desktop/pushGit.sh " + urlCloneGIT + " " + email + " " + user + " " + pass + " " + pathLogFile + " " + pathDirectoryProject);
		    msgPush = this.validateLogExecution(pathLogFile, "pushEndFileLog.txt");
						
			System.out.println("Finalizando executorPushBASH(...)");
		} catch(IOException ioException) {
		    System.out.println(ioException.getMessage() );
		} catch(PatternSyntaxException pse) {
			pse.printStackTrace();
		}		
		
		return msgPush;		
	}
	
	
	public String executorPush(String pathDirectoryProject, String pathLogFile, String urlClone, String email, String user, String pass) {
		Runtime runtime = Runtime.getRuntime();
		String msgPush = "";
		
		try {			
			System.out.println("Iniciando executorPushBASH(...)");

			msgPush = executorPushBASH(pathDirectoryProject, pathLogFile, urlClone, email, user, pass);
			System.out.println("********** msgPush: " + msgPush + " ************");
			
			String msgStatus = this.executorStatusBASH(pathDirectoryProject, pathLogFile);
			boolean conflicts = msgStatus.indexOf("conflicts") >= 0 ? true : false;
			System.out.println("msgStatus: " + msgStatus);
			
			if( conflicts ) {
				msgPush = msgStatus + " " + this.reloadTreeViewConflictedFiles(pathDirectoryProject, pathLogFile);
			}
						
			System.out.println("Finalizando executorPushBASH(...)");
		} catch(PatternSyntaxException pse) {
			pse.printStackTrace();
		}		
		
		return msgPush;
	}

	public String executorStatusBASH(String pathDirectoryProject, String pathLogFile) {
		Runtime runtime = Runtime.getRuntime();
		String msgStatus = "";
		
		try {
			System.out.println("Iniciando executorStatusBASH(...)");
			
		    Process p1 = runtime.exec("cmd /c start C:/Users/javier.perezb/Desktop/statusGit.sh " + pathDirectoryProject + " " + pathLogFile);		    
		    msgStatus = this.validateLogExecution(pathLogFile, "statusEndFileLog.txt");
			
		    System.out.println("Finalizando executorStatusBASH(...)");
		} catch(IOException ioException) {
		    System.out.println(ioException.getMessage() );
		} catch(PatternSyntaxException pse) {
			pse.printStackTrace();
		}
		
		return msgStatus;
	}	
	
	private String reloadTreeViewConflictedFiles(String pathDirectoryProject, String pathLogFile) {
		BufferedReader br = null;
		String treeView = "";
		
		try {
			System.out.println("Iniciando reloadTreeViewConflictedFiles(...)");

		    br = this.uploadLogFile(pathLogFile);			
			List<String> conflictedFiles = this.getConflictedFiles(pathDirectoryProject, br);
			treeView = this.uploadTreeView(pathDirectoryProject, conflictedFiles, null);
			
			System.out.println("Finalizando reloadTreeViewConflictedFiles(...)");			
		} catch(PatternSyntaxException pse) {
			pse.printStackTrace();
		}
		
		return treeView;
		
	}
	
	private List<String> getConflictedFiles(String pathDirectoryProject, BufferedReader br){
		List<String> conflictedFiles = new ArrayList<>();
		boolean initConflictedFiles = false;
		
		try {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				if( !initConflictedFiles )
					initConflictedFiles = sCurrentLine.indexOf("Unmerged paths") >= 0 ? true : false;
					
				boolean endConflictedFiles = sCurrentLine.indexOf("no changes added to commit") >= 0 ? true : false;
				
				if( initConflictedFiles ) {
					boolean isConflictedFile = sCurrentLine.indexOf("both modified") >= 0 ? true : false;
					
					if( isConflictedFile ) {
						conflictedFiles.add(pathDirectoryProject.replace("\\", "\\\\")+"\\\\"+sCurrentLine.substring(sCurrentLine.indexOf(":")+1, sCurrentLine.length()).trim().replace("/", "\\\\"));
					}
				}
				
				if( endConflictedFiles ) {
					break;
				}
			}				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return conflictedFiles;
	}
	
	public String validateLogExecution(String pathLogFile, String msgEndLogFile) {
		BufferedReader br = null;
		String msgLogFile = "Operacion generada exitosamente..";

		try {
			System.out.println("Iniciando validateLogExecution(...)");
			
			//Con esta linea se garantiza que el log file ya esta completo al 100%
			this.waitCompletedLogFile(pathLogFile, msgEndLogFile);
			br = this.uploadLogFile(pathLogFile);
			
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("--> sCurrentLine: " + sCurrentLine);
				
				boolean denied = sCurrentLine.indexOf("denied") >= 0 ? true : false;
				boolean conflicts = sCurrentLine.indexOf("conflicts") >= 0 ? true : false;
				boolean exist = sCurrentLine.indexOf("already exists") >= 0 ? true : false;
				boolean errorPulling = sCurrentLine.indexOf("error: Pulling") >= 0 ? true : false;
				boolean authenticationFailed = sCurrentLine.indexOf("Authentication failed") >= 0 ? true : false;
				
				
				if( exist ) {
					msgLogFile = sCurrentLine;
					break;
				}
				
				if( denied ) {
					msgLogFile = sCurrentLine;
					break;
				}
				
				if( conflicts ) {
					msgLogFile = sCurrentLine;
					break;
				}
				
				if( errorPulling ) {
					msgLogFile = sCurrentLine;
					break;					
				}
				
				if( authenticationFailed ) {
					msgLogFile = sCurrentLine;
					break;					
				}
			}
			
			System.out.println("Finalizando validateLogExecution(...)");			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return msgLogFile;
	}
	
	
	
	/**
	 * Carga el log que genera la peticion PUSH-GIT
	 * @param pathFileLog ruta del directorio a cargar.
	 * @return BufferedReader. (Con informacion del log)
	 */
	private BufferedReader uploadLogFile(String pathFileLog) {
		BufferedReader br = null;
		File fr = null;

		/**
		 * Se usa este ciclo para esperar a que el archivo .sh termine de ejecutar sus tareas, 
		 * y por consiguiente de generar el archivo log.txt
		 */
		do {
			try {
				fr = new File(pathFileLog);
				InputStreamReader isr = new InputStreamReader(new FileInputStream(fr), "UTF-8");				
				br = new BufferedReader(isr);
				System.out.println("Esperando log file...");
			}catch(Exception e) {
			}
		}while( fr == null || br == null );
		
		return br;
	}
	
	/**
	 * Determina si el log file se ha generado completamente.
	 * @param pathFileLog
	 * @return
	 */
	private void waitCompletedLogFile(String pathLogFile, String msgEndLogFile) {
		BufferedReader br = null;
		File fr = null;

		System.out.println("wait log file completed...");
		
		/**
		 * Se usa este ciclo para esperar a que el archivo .sh termine de ejecutar sus tareas, 
		 * y por consiguiente de generar el archivo log.txt
		 */
		do {
			try {
				fr = new File(pathLogFile);
				InputStreamReader isr = new InputStreamReader(new FileInputStream(fr), "UTF-8");
				
				this.closeBufferedReader(br);
				br = new BufferedReader(isr);
			}catch(Exception e) {
			}
		}while( fr == null || br == null || !this.containEndLogFile(br, msgEndLogFile) );
		
		this.closeBufferedReader(br);
		
		System.out.println("receiving log file completed...");
	}
	
	private boolean containEndLogFile(BufferedReader br, String msgEndLogFile) {
		boolean eureka = false;
		try {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				boolean containEndLogFile = sCurrentLine.indexOf(msgEndLogFile) >= 0 ? true : false;
				
				if( containEndLogFile ) {
					eureka = true;
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return eureka;
	}
	
	public String uploaderFile(String pathDirectoryProject, String pathFile) {
		BufferedReader br = null;
		File fr = null;
		String contentFile = "";

		try {
			fr = new File(pathFile);
			InputStreamReader isr = new InputStreamReader(new FileInputStream(fr), "UTF-8");
			br = new BufferedReader(isr);

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println("--" + sCurrentLine);
				contentFile += sCurrentLine + "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		return contentFile;
	}

	public String saveFile(String pathFile, String data, String pathDirectoryProject, String isNewRdl) {
		PrintStream out = null;
		String updateTreeView = null;
		
		try {			
			if( isNewRdl.equals("true") ){
				boolean existDirectory = this.existDirectory(pathDirectoryProject + "\\Rdl\\");
				if( !existDirectory ){
					this.createDirectory(pathDirectoryProject + "\\Rdl\\");
				}
				
				pathFile = pathDirectoryProject + "\\Rdl\\" + pathFile;
			}
			
			out = new PrintStream(new FileOutputStream(pathFile));
		    out.print(data);
		    
		    updateTreeView = this.uploadTreeView(pathDirectoryProject, null, null);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(out != null ) {
				out.close();
			}
		}
		
		return updateTreeView;
	}
	
	public boolean existDirectory(String pathFile) {
		File file = new File(pathFile);
		
		if( file.exists() ) {
			return true;
		}else {
			return false;
		}
	}

	public void createDirectory(String pathFile) {
		File file = new File(pathFile);
		
		try {
			if( !file.exists() ) {
				file.mkdir();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public String executorClone(String urlClone, String pathDirectoryProject, String pathLogFile) {
		String msgClone = null;

		File f = new File(pathDirectoryProject);
		
		if( f.exists() ) {
			msgClone = "The destination path " + pathDirectoryProject + " already exists and is not empty directory.";
		}else {
			String msgCloneBASH = this.executorCloneBASH(urlClone, pathDirectoryProject, pathLogFile);
			boolean exist = msgCloneBASH.indexOf("already exists") >= 0 ? true : false;
			if( exist ){
				msgClone = msgCloneBASH;
			}else{
				msgClone = msgCloneBASH + " " + this.uploadTreeView(pathDirectoryProject, null, null);
			}
		}

		return msgClone;
	}
	
	public String executorRefresh(String urlClone, String pathDirectoryProject, String pathLogFile) {
		String msgRefresh = null;
		
		String msgStatusBASH = this.executorStatusBASH(pathDirectoryProject, pathLogFile);
		boolean conflicts = msgStatusBASH.indexOf("conflicts") >= 0 ? true : false;
		if( conflicts ) {
			msgRefresh = msgStatusBASH + " " + this.reloadTreeViewConflictedFiles(pathDirectoryProject, pathLogFile);
		}else {
			String msgPullBASH = this.executorPullBASH(pathDirectoryProject, pathLogFile);
			boolean conflictsPULL = (msgPullBASH.indexOf("conflicts") >= 0 || msgPullBASH.indexOf("error: Pulling") >= 0) ? true : false;

			if( conflictsPULL ) {
				msgRefresh = msgPullBASH + " " + this.reloadTreeViewConflictedFiles(pathDirectoryProject, pathLogFile);
			}else {
				msgRefresh = this.uploadTreeView(pathDirectoryProject, null, null);
			}
			
		}
		
		return msgRefresh;
	}
	
}
