package com.bilgeadam.boost.week03.lesson005.alperen;

	import java.util.Scanner;

	public class ShapeTest {
		
		/*
		 * Author: Alperen İKİNCİ
		 * BilgeAdamBoostJava4 - Marathon #1 
		 */
		
		public static void main(String[] args) 
		{
			ShapeTest shapeTest = new ShapeTest();
			shapeTest.readInput();
			System.out.println("Bye...");
		}
		
		private void readInput() 
		{
			Scanner input;
			SideInput sides = new SideInput();
			
			int shapeNo =0;
			boolean exit = true;
			
			while(exit)
			{
				int i = 1;
				shapeNo++;
				sides.setSide1(0);
				sides.setSide2(0);
				sides.setSide3(0);
				sides.setSide4(0);
				System.out.println("Please enter the length parameters of the shape (4 lenghth max.) to exit please type (-1) : ");
				
					while(i<5)
					{
						double selection;
						System.out.print("Please enter the length number "+i +" (0 to end) : " );
						input = new Scanner(System.in);
						selection = input.nextDouble();
						
						if (selection == 0 && i<=3 && sides.getSide1()==0) 
							{
							System.err.println("\nGeometric shapes require at least 3 side input!!!\n");
							continue;
							}
						
						
						if (selection == 0 && i==4 ) 
							{
							double diameter = calculateDiameter(sides.getSide1(),sides.getSide2(), sides.getSide3(), sides.getSide4());
							System.out.println("\nDiameter of the shape "+shapeNo+" is : "+diameter);
							String area = calculateArea("");
							System.out.println("Area of the shape "+shapeNo+ " is : "+ area+" It is a triangle after all -_- \n");
							break;
							}
							
						if (sides.getSide1() == sides.getSide2() && selection == 0)
							{
							System.out.println("\nOh! You are looking for a square!\nHere you go pal!");
							double diameter = calculateDiameter(sides.getSide1(),sides.getSide2(), sides.getSide3(), sides.getSide4());
							System.out.println("\nDiameter of the shape "+shapeNo+" is : "+diameter);
							String area = calculateArea("");
							System.out.println("Area of the shape "+shapeNo+ " is : "+ area+" It is a square after all -_- \n");
							break;
							}
						
						if (sides.getSide1() == sides.getSide2() && selection == 0)
							{
							System.out.println("\nOh! You are looking for a square!\nHere you go pal!");
							double diameter = calculateDiameter(sides.getSide1(),sides.getSide2(), sides.getSide3(), sides.getSide4());
							System.out.println("\nDiameter of the shape "+shapeNo+" is : "+diameter);
							String area = calculateArea("");
							System.out.println("Area of the shape "+shapeNo+ " is : "+ area+" It is a square after all -_- \n");
							break;
							}	
							
						if (selection == -1) 
							{
							exit = false;
							break;
							}
						else if (selection < 0) 
							{
							System.err.println("\nLength can not be negative!!!");
							continue;
							}
						else if (selection == 0) 
							{
							break;
							}
							
						switch (i) 
						{
							case 1: 
								{
								sides.setSide1(selection);
								break;
								}
							case 2:
								{
								sides.setSide2(selection);
								break;
								}
							case 3:
								{
								sides.setSide3(selection);
								break;
								}
							case 4:
								{
								sides.setSide4(selection);
								double diameter = calculateDiameter(sides.getSide1(),sides.getSide2(), sides.getSide3(), sides.getSide4());
								System.out.println("\nDiameter of the shape "+shapeNo+" is : "+diameter);
								String area = calculateArea("");
								System.out.println("Area of the shape "+shapeNo+ " is : "+ area+" It is a rectangle after all -_- \n");
								break;
								}
						}
							i++;
								
					}
			
			}
				
		}

		private String calculateArea(String area)
		{
			area = "Does it even matter?";
			return area;
		}

		private double calculateDiameter(double a , double b , double c, double d) 
		{
			double diameter = a+b+c+d;
			return diameter;
		}

		
		}
