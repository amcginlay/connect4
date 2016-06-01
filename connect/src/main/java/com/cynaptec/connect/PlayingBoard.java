package com.cynaptec.connect;

//import static java.util.Objects.requireNonNull;
import static com.cynaptec.connect.Objects.*;

public class PlayingBoard {

	private PlayingBoardDimensions playingBoardDimensions; // TODO can we get rid of this?
	private IPlayingPiece[][] grid;
	
	public PlayingBoard(PlayingBoardDimensions playingBoardDimensions) {
		requireNonNull(playingBoardDimensions, "playingBoardDimensions");
			
		this.playingBoardDimensions = playingBoardDimensions;
		this.grid = new IPlayingPiece[playingBoardDimensions.getSizeX()][playingBoardDimensions.getSizeY()];
	}

	public int getSizeX() {
		return playingBoardDimensions.getSizeX();
	}

	public int getSizeY() {
		return playingBoardDimensions.getSizeY();
	}
	
	public boolean isInBounds(Coordinates coords) {
		int x = coords.getX();
		int y = coords.getY();
		if (x < 1 || y < 1 || x > getSizeX() || y > getSizeY()) {
			return false;
		}
		return true;
	}

	public void setPieceAt(IPlayingPiece playingPiece, Coordinates coords) {
		requireNonNull(playingPiece, "playingPiece");
		requireNonNull(coords, "coords");
		
		if (!isInBounds(coords))
			throw new IllegalArgumentException();
		
		int x = coords.getX();
		int y = coords.getY();
		this.grid[x - 1][y - 1] = playingPiece;
	}

	public IPlayingPiece getPieceAt(Coordinates coords) {
		requireNonNull(coords, "coords");

		if (!isInBounds(coords))
			throw new IllegalArgumentException();
			
		int x = coords.getX();
		int y = coords.getY();
		return grid[x - 1][y - 1];
	}
}
