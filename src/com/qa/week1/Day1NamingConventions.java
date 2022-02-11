package com.qa.week1;

public class Day1NamingConventions {

//	PascalCase / UpperCamelCase Where each new word has a capital letter to start.
//	camelCase / lowerCamelCase The same as PascalCase except the first word is always all lower case.
//	snake_case All lower case separated by underscores _
//	UPPERCASE All upper-case.
//	lower-case All lower-case.
	
	//Packages - period.separated.lowercase
	//e.g. package com.qa.week1
	
	//Class names - nouns - PascalCase
	public class ImageSprite{ }
	
	//Method names - verbs - camelCase
	public void draw(){ }
	public double getPerimeter(){
		return 0; }
	
	//Variable names - short but descriptive - camelCase
	String name;
	int age;
	boolean hasJob;
	float bankBalance = 1.23f;
	
	//Temporary variables for indexing/iterations - single characters
	// i, j, k, m, n used for integers (int)
	// c, d, e used for characters (char)
	  
//		for (int i : age) {
//			System.out.println(i);
//		}
	
	//Test class names - use name of the class to be tested preceded or followed by Test
	public class ImageSpriteTest{}
	
	//Interfaces and implementations - adjectives - PascalCase
	//include listener or service as appropriate
	public interface Drawable { }
	public interface ActionListener { }
	public interface DrawService { }
	
	//First implementation of and Interface - use interface name with "Impl" suffix
	public class DrawableImpl implements Drawable { }
	public class ActionListenerImpl implements ActionListener { }
	public class DrawServiceImpl implements DrawService { }
	
	//Constants and Enums - UNDERSCORE_SEPARATED_UPPERCASE
	static final int EARTH_RADIUS_KM = 6731;

	enum Direction { NORTH, SOUTH, EAST, WEST }
	
	//Generic Types - UPPERCASE single characters
//	T (for Type) is recommended
//	E (for Element) is recommended for Collections
//	K (for Key) & V (for Value) is recommended for maps
//	S (for Service) is recommended for service loaders
//	
	
	//Exceptions  - use Exception with Invalid or Illegal modifiers for Exception name
	// e.g. public class InvalidDirectionException extends Exception { }
	
	//Acronyms - no hard rules - company conventions may exist
	//e.g. public class XML() { }
	//e. g. public class ExtensibleMarkupLanguge(){ }

	public void convertPDFToXML() { }
	public void convertPdfToXml() { }
	public void convertPortableDocumentFormatToExtensibleMarkupLanguage() { }
	
}
