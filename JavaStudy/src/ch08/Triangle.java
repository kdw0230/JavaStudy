package ch08;

public class Triangle {
	float Bottom;
	float Height;

	public Triangle() {
	}

	public Triangle(float Bottom, float Height) {
		this.Bottom = Bottom;
		this.Height = Height;
	}

	public float getArea() {
		return Bottom * Height / 2.0f;
		// return Bottom * Height * 0.5f;
	}

	public float getBottom() {
		return Bottom;
	}

	public void setBottom(float bottom) {
		this.Bottom = bottom;
	}

	public float getHeight() {
		return Height;
	}

	public void setHeight(float height) {
		this.Height = height;
	}

}
