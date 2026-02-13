package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public abstract class Tile{
    
    protected int TileCoordinate;

    Tile(int TileCoordinate){
        this.TileCoordinate = TileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{

        EmptyTile(int Coordinate){
            super(Coordinate);
        }

        @Override
        public boolean isTileOccupied() {
            return false;
        }

        @Override
        public Piece getPiece(){
            return null;
        }

    }

    public static final class OccupiedTile extends Tile{
        protected Piece pieceOnTile;

        OccupiedTile(int tileCoordinate, Piece pieceOnTile){
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }

        @Override
        public boolean isTileOccupied() {
            return true;
        }   
        

        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }

}