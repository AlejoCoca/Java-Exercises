package main;

public interface Movible {
	double getPositionX();

	double getPositionY();

	void incrementarPos(double incX, double incY) throws IncrementoImposibleException;

	double distancia(Movible otro);
}
