package Frame_Building_Blocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constructor {

	public static void main(String[] args) throws InterruptedException {

		Constructor obj = new Constructor();
		obj.car("Coding", 50);
		obj.Bike();
		Constructor obj1 = new Constructor("Automation", 'C');

	}

	public void car(String x, int b)

	{
		System.out.println(x + " " + b);
	}

	public Constructor(String n, char c) {
		System.out.println(n + " " + c);
	}

	public Constructor()

	{
		System.out.println("Constructor");
	}

	public void Bike()

	{
		System.out.println("Bike");
	}

	public void Thar()

	{
		System.out.println("Thar");
	}

}
