package boardgame;

public class Position {
	
	private int row;
	private int collumn;
	
	public Position(int row, int collum) {
		this.row = row;
		this.collumn = collum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCollumn() {
		return collumn;
	}

	public void setCollum(int collum) {
		this.collumn = collumn;
	}
	
	@Override
	public String toString() {
		return row + "," + collumn;
	}

}
