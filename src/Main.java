import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		    	System.out.println();
		    	System.out.println("\t WELCOME TO THE MENU  \n");
		        optionsSelection();
		    }
		    private static void optionsSelection() {
		        String[] arr = {"1. I wish to review my salaries",
		                "2. I wish to add my salaries",
		                "3. I wish to delete my salaries",
		                "4. I wish to sort the salaries",
		                "5. I wish to search for a particular salaries",
		                "6. Close the application"
		        };
		        int[] arr1 = {1,2,3,4,5,6};
		        int  slen = arr1.length;
		        for(int i = 0; i < slen; i++){
		            System.out.println(arr[i]);
		        }
		        ArrayList<Integer> arrlist = new ArrayList<Integer>();
		        ArrayList<Integer> salaries = new ArrayList<Integer>();
		        salaries.add(20000);
		        salaries.add(35000);
		        salaries.add(29000);
		        salaries.add(32000);
		        salaries.add(15000);
		        salaries.addAll(arrlist);
		        System.out.println("\n Please Enter your choice:\t");
		        Scanner sc = new Scanner(System.in);
		        int  options =  sc.nextInt();
		        for(int j = 1;j <= slen; j++){
		            if(options==1) {
		                        System.out.println("Your saved salaries are listed below: \n");
		                        System.out.println(salaries+"\n");
		                        optionsSelection();
		            }
		            else if(options == 2) {
		                        System.out.println("Enter the value to add your salaries: \n");
		                        int value = sc.nextInt();
		                        salaries.add(value);
		                        System.out.println("Your value is updated\n");
		                        salaries.addAll(arrlist);
		                        System.out.println(salaries+"\n");
		                        optionsSelection();
		            }
		            else if(options == 3) {
		                        System.out.println("You are about the delete all your salaries! \nConfirm again by selecting the same option...\n");
		                        int con_choice = sc.nextInt();
		                        if(con_choice==options){
		                        	salaries.clear();
		                            System.out.println(salaries+"\n");
		                            System.out.println("All your salaries are erased!\n");
		                        } else {
		                            System.out.println("Oops... try again!");
		                        }
		                        optionsSelection();
		            }
		            else if(options == 4) {
		                        sortSalaries(salaries);
		                        optionsSelection();
		            }
		            else if(options == 5) {
		                   
		                        searchSalaries(salaries);
		                        optionsSelection();
		            }
		            else if(options == 6) {
		                        closeApp();
		            }
		            else
		                        System.out.println("You have made an invalid choice!");
		            break;		          		                 
		                }
		            }
		    private static void closeApp() {
		        System.out.println("Closing your application... \nThank you!");
		    }
		    private static void searchSalaries(ArrayList<Integer> arrayList) {
		        int leng = arrayList.size();
		        System.out.println("Enter the salary you need to search:\t");
		        Scanner sc = new Scanner(System.in);
					int salaries = sc.nextInt();
					for (int i = 0; i < leng; i++) {
						if (arrayList.get(i) == salaries) {
						System.out.println("The salaries '" + salaries + "' has been found.\n");
						} 
					}	
		    }
		    private static void sortSalaries(ArrayList<Integer> arrayList) {
		    	int arrlength =  arrayList.size();
		        Collections.sort(arrayList);
		        System.out.println("Your sorted salaries in an ascending order:");
		        System.out.println(arrayList);
		        System.out.println();
		    }
}



