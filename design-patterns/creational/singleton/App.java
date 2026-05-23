
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			FileNotFoundException, IOException, CloneNotSupportedException {
		Singleton firstSingletonInstance = Singleton.getInstance();
		System.out.println("First Singleton Instance Hashcode: " + firstSingletonInstance.hashCode());

		Singleton duplicateSingletonInstance = Singleton.getInstance();
		System.out.println("Duplicate Singleton Instance hashcode: " + duplicateSingletonInstance.hashCode());

		System.out.println("Breaking Singleton...");

		// Break Singleton - using Reflection
		Class<?> singletonClass = Class.forName("designpattern.Singleton");
		@SuppressWarnings("unchecked")
		Constructor<Singleton> constructor = (Constructor<Singleton>) singletonClass.getDeclaredConstructor();
		constructor.setAccessible(true);

		Singleton brokenSingletonUsingReflection = constructor.newInstance();
		System.out.println("Broken Singleton hashcode using Reflection: " + brokenSingletonUsingReflection.hashCode());

		System.out.println("-------------------------------------");
		// Break Singleton - using serialization & deserialization
		// serialization
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		oos.writeObject(firstSingletonInstance);
		oos.close();
		// deserialization
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
		Singleton brokenSingletonUsingSerialization = (Singleton) ois.readObject();
		ois.close();

		System.out.println("Broken Singleton hashcode using serialization: " + brokenSingletonUsingSerialization.hashCode());

		System.out.println("-------------------------------------");

		// Break Singleton - using Cloning

		Singleton brokenSingletonUsingClone = (Singleton) firstSingletonInstance.clone();
		System.out.println("Broken Singleton hashcode using Clone: " + brokenSingletonUsingClone.hashCode());

	}
}
