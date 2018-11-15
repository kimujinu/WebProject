package kr.ac.dit.domain;

public class UploadFileVO {
	  private int fileId;
	  private String fileName;
	  private byte[] fileData; //DB상에서 BLOB타입
	  
	  public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getFileData() {
		return fileData;
	}
	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}
}
