
import java.util.Scanner;
/**
 * Write a description of class MadLibs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadLibs
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter the month (as a digit): ");
            int month = input.nextInt();
            System.out.println("Enter the day (as a digit): ");
            int day = input.nextInt();
            System.out.println("Enter the year (as a digit): ");
            int year = input.nextInt();
            input.nextLine(); // clearing the buffer
            System.out.println("Enter a Foreign Country: ");
            String foreignCountry = input.nextLine();
            System.out.println("Enter an Adverb: ");
            String firstAdverb = input.nextLine();
            System.out.println("Enter an Adjective: ");
            String firstAdjective = input.nextLine();
            System.out.println("Enter an Animal:" );
            String animal = input.nextLine();
            System.out.println("Enter a verb ending in ING:" );
            String firstVerbING = input.nextLine();
            System.out.println("Enter a Verb" );
            String firstVerb = input.nextLine();
            System.out.println("Enter a verb ending in ING: ");
            String secondVerbING= input.nextLine();
            System.out.println("Enter an Adverb: ");
            String secondAdverb = input.nextLine();
            System.out.println("Enter an Adjective: ");
            String secondAdjective = input.nextLine();
            System.out.println("Enter a Place:");
            String place = input.nextLine();
            System.out.println("Enter a Liquid: ");
            String liquid = input.nextLine();
            System.out.println("Enter a Part of the Body: ");
            String bodyPart = input.nextLine();
            System.out.println("Enter a Verb: ");
            String secondVerb = input.nextLine();
            
            System.out.println (name + ", " + month + "/" + day + "/" + year);
            System.out.println("If you are traveling in " + foreignCountry + " and find yourself having");
            System.out.println("to cross a piranha-filled river, here's how to do it " + firstAdverb + ":");
            System.out.println("Piranhas are more " + firstAdjective + " during the day, so cross the river");
            System.out.println("at night. Avoid areas with netted " + animal + " traps- piranhas may be");
            System.out.println(firstVerbING + " there looking to " + firstVerb + " them! When " + secondVerbING + " the river,");
            System.out.println("swim " + secondAdverb + ". You don't want to wake them up and make");
            System.out.println("them " + secondAdjective + "! Whatever you do, if you have an open wound,");
            System.out.println("try to find another way to get back to the " + place + ". Piranhas are");
            System.out.println("attracted to fresh " + liquid + " and will most likely take a bite out of");
            System.out.println("your " + bodyPart + " if you " + secondVerb + " in the water!");
            
            
            
            
            
            
            
            
        }
        
    
    }

