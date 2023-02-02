package codePractice;
import java.util.Scanner;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		try {
			System.out.println("---------------------------------------------------");
			System.out.println("Welcome!");
			System.out.println("---------------------------------------------------");


			do {
				int Choice;
				System.out.println("-----------------------------------------------");
				System.out.println("1 Retrieving the file names in an ascending order.");
				System.out.println("2 Business-level operations.");
				System.out.println("3 close the application.");
				System.out.println("-----------------------------------------------");
				System.out.println("Enter  your choice by pressing  number (1 or 2 or 3)");
				Scanner SC = new Scanner(System.in);
				Choice = SC.nextInt();

				switch (Choice) {
				case 1:
					System.out.println("File names in an ascending order.");
					Client C = new Client();
					C.Displayfilesinascendingorder();
					break ;

				case 2: {
					Client C1 = new Client();
					C1.Submainu();
				}
					break;

				case 3:
					System.out.println(" Thanks for using LockedMe.com application");
					System.exit(0);
					break;

				default:
					System.out.println("Please enter correct choice 1 or 2 or 3");
					break;
				}

			} while (true);

		} catch (Exception e) {
			System.out.println("Application need support contact admin=mainmenu");
		}
	}

	public void Displayfilesinascendingorder() {
		try {
			String Path = "D:\\";
			File file = new File(Path);
			String[] myfiles = file.list();

			for (String i : myfiles) {
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println("has some error");
		}

	}

	public void Submainu() {
		try {
			int Choice;

			do {
				System.out.println("Business-level operations.");
				System.out.println("--------------------------------------------------");
				System.out.println("1 Add a user specified file to the application.");
				System.out.println("2 Delete a user specified file from the application.");
				System.out.println("3 Search a user specified file from the application.");
				System.out.println("4 Return to the main .");
				System.out.println("---------------------------------------------------");
				System.out.println("Enter  your choice by pressing  number (1 or 2 or 3 or 4)");
				Scanner SC = new Scanner(System.in);
				Choice = SC.nextInt();
				outer:

				switch (Choice) {
				case 1:
					Client C2 = new Client();
					C2.Createafile();
					break outer;

				case 2:
					Client C3 = new Client();
					C3.Searchafile();
					break outer;

				case 3:
					Client C4 = new Client();
					C4.Deleteafile();
					break outer;

				case 4:
					break outer;

				default:
					System.out.println("Enter correct choice");
					break;
				}
				SC.close();
			} while (true);

		} catch (Exception e) {
			System.out.println("Application need support contact admin");
		}
	}

	public void Createafile() {
		try {
			String Path = "D:\\";
			String Filename, FinalPath;
			Scanner SC = new Scanner(System.in);
			System.out.println("Enter File name with extension");
			Filename = SC.next();
			FinalPath = (Path + Filename);
			File file = new File(FinalPath);
			if (file.exists()) {
				System.out.println("File name already exist");
			} else {
				file.createNewFile();
				System.out.println("File created");
				String[] myfiles = file.list();

				for (String i : myfiles) {
					System.out.println(i);
				}
			}

		} catch (Exception e) {
			System.out.println("has some error");
		}
	}

	public void Searchafile() {
		try {
			String Path = "D:\\";
			String Filename, FinalPath;
			Scanner SC = new Scanner(System.in);
			System.out.println("Enter File name with extension");
			Filename = SC.next();
			FinalPath = (Path + Filename);
			File file = new File(FinalPath);
			if (file.exists()) {
				System.out.println("file found");
				System.out.println(file.getName() + " at " + file.getAbsolutePath());
			} else {
				System.out.println("File name does not exist ");
			}

		} catch (Exception e) {
			System.out.println("has some error");
		}

	}

	public void Deleteafile() {
		try {
			String Path = "D:\\";
			String Filename, FinalPath;
			Scanner SC = new Scanner(System.in);
			System.out.println("Enter File name with extension");
			Filename = SC.next();
			FinalPath = (Path + Filename);
			File file = new File(FinalPath);
			if (file.exists()) {
				file.delete();
				System.out.println("File deleted");
				String[] myfiles = file.list();

				for (String i : myfiles) {
					System.out.println(i);
				}
			} else {
				System.out.println("File name does not exist ");
				String[] myfiles = file.list();

				for (String i : myfiles) {
					System.out.println(i);
				}
			}

		} catch (Exception e) {
			System.out.println("has some error");
		}
	}
}