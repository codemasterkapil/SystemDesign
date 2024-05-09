package ChessGame.Pieces;

import ChessGame.Board;
import ChessGame.Colour;

public abstract class Piece {
    public int posx;
    public int posy;
    public Colour colour;
    public PieceName pieceName;

    public Status status;

    public Piece(int posx, int posy, Colour colour, Status status,PieceName pieceName) {
        this.posx = posx;
        this.posy = posy;
        this.colour = colour;
        this.status = status;
        this.pieceName=pieceName;
    }

    public abstract boolean move(Board board ,int x,int y);
    public boolean moveBishop(Board board ,int x,int y)
    {
        int row = posx, col = posy;
        if (x == posx && y == posy) return false;
        if(x<0 || y<0 || x>=8 || y>=8) return false;

        if (posx - x == y - posy) {
            while (row >= 0 && col < 8) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (x == row && y == col) return true;
                row--;
                col++;
            }
        } else if (posx - x == posy - y) {
            while (row >= 0 && col >= 0) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (row == x && col == y) return true;
                row--;
                col--;
            }
        } else if (x - posx == posy - y) {
            while (row < 8 && col >= 0) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (x == row && y == col) return true;
                row++;
                col--;
            }
        } else if (x - posx == y - posy) {
            while (row < 8 && col < 8) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (row == x && col == y) return true;
                row++;
                col++;
            }
        }
        return false;
    }

    public boolean moveRook(Board board ,int x,int y){
        int row = posx, col = posy;
        if (x == posx && y == posy) return false;
        if(x<0 && y<0 && x>=8 && y>=8) return false;

        if (posx==x && y>posy) {
            while (col<8) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (x == row && y == col) return true;
                col++;
            }
        } else if (posx<x && posy==y) {
            while (row <8) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (row == x && col == y) return true;
                row++;
            }
        } else if (x==posx && posy>y) {
            while (col >= 0 ) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (x == row && y == col) return true;
                col--;
            }
        } else if (x<posx && y==posy) {
            while (row >=0) {
                if (board.board[row][col] != null) {
                    if (x == row && y == col && (board.board[row][col].getPiece().colour != colour)) return true;
                    else return false;
                }
                if (row == x && col == y) return true;
                row--;
            }
        }
        return false;
    }

}
