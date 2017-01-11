public class CircleWithStaticMembers{
	double radius;
	static int numberOfObjects=0;
	CircleWithStaticMembers() {
		radius = 1;
		numberOfObjects++;
	}
	CircleWithStaticMembers(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}

	/** Return numberOfObjects */
	static int getNumberOfObjects() {
		return numberOfObjects;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

}