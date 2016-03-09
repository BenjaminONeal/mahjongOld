
public abstract class Tile {
	public boolean matches(Tile other)
	{
		boolean result = false;
		if (this == other) result = true;
		if (other == null) result = false;
		if (getClass() == other.getClass()) result = true;
		return result;
	}
}
