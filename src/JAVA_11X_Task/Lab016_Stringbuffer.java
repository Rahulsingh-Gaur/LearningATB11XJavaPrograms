package JAVA_11X_Task;

public class Lab016_Stringbuffer {
    public static void main(String[] args) {

       // 1. Creating a StringBuffer
        StringBuffer SB =new StringBuffer("Rahul");
        System.out.println(SB);

        //2. append(String s): Adds text at the end
        StringBuffer SB1=new StringBuffer("Rahul");
        SB1.append("Sigh Hajari");
        System.out.println("Append :"+SB1);

        //3. insert(int index, String s): Inserts text at a given position
        StringBuffer SB2 =new StringBuffer("RAHUL");
        SB2.insert(0,"Gaur");
        System.out.println("Insert :" + SB2);

        //4. replace(int start, int end, String s): Replaces a substring
        StringBuffer SB3 =new StringBuffer("RAHUL SINGH GAUR");
        SB3.replace(12,16,"Hajari");
        System.out.println("Replace: "+ SB3);

        //5. delete(int start, int end): Deletes a substring
        StringBuffer SB4 =new StringBuffer("Rahul Singh Gaur Hajari");
        SB4.delete(11,16);
        System.out.println("delete:"+SB4);

        //6. reverse(): Reverses the string
        StringBuffer SB5 =new StringBuffer("GAUR SINGH RAHUL");
        SB5.reverse();
        System.out.println("reverse :"+SB5);

        //7. capacity(): Returns the capacity of the buffer
        //The capacity() method returns the total capacity of the buffer,
        // which is the maximum number of elements the buffer can hold without resizing.
        //Capacity ≠ Size: Capacity is the maximum possible elements; size is the current number of elements.
        StringBuffer SB6 =new StringBuffer();
        System.out.println("Default capacity :" +SB6.capacity());//// Default: 16

        //capacity()
        StringBuffer SB7 =new StringBuffer("RAHUL");
        System.out.println("custmized capacity :" +SB7.capacity());// 16+5 =21

        //8. ensureCapacity(int minCapacity): Ensures a minimum capacity
        StringBuffer SB8 =new StringBuffer();
        SB8.ensureCapacity(22); // Output: 34 (if default is exceeded)
        System.out.println("min capacity :" +SB8.capacity());

        //9. charAt(int index): Returns a character at a specified index
        StringBuffer Sb9=new StringBuffer("RAhulsingh Hajri");
        System.out.println("charat:"+Sb9.charAt(7));

        //10. setCharAt(int index, char ch): Changes a character at a position
        //Why can’t we print directly?
        //    setCharAt() is a void method (does not return anything).
        //check this for more details
        // https://chat.deepseek.com/a/chat/s/99034ab1-2789-4693-8a5d-9f8a84a95a8a
        StringBuffer SB10 =new StringBuffer("RAHUL");
        SB10.setCharAt(2,'z');
        System.out.println("Set char :"+SB10);

        //11. length(): Returns the length of the buffer
        StringBuffer SB11 =new StringBuffer("Rahul Singh Gaur Hajari");
        System.out.println("Length:"+SB11.length());

        //12. substring(int start): Extracts a substring
        //The substring(int start) method extracts a portion of the string
        // from the specified start index to the end of the string.
        // It returns a new String (does not modify the original buffer).
        StringBuffer SB12 =new StringBuffer("RAHUL GAUR HAJRI");
        System.out.println("SUb string:"+SB12.substring(14)); //o/p RI

       // 13. substring(int start, int end): Extracts a substring within a range
        StringBuffer SB13 =new StringBuffer("RAHUL GAUR HAJRI");
        System.out.println("Sub String in range :"+SB13.substring(7,10)); //o/p AUR

        //14. toString(): Converts StringBuffer to String
        StringBuffer Sb14 =new StringBuffer("KRISHNA");
        System.out.println("the String is :"+Sb14.toString());

        //15. trimToSize(): Reduces capacity to fit the current content
        StringBuffer SB15=new StringBuffer(100); //Set the capacity to 100
        SB15.append("RAHULSNGH HAJAI GAUR"); //20 length is added 100-20=80
        SB15.trimToSize();
        System.out.println("the final Capsity:"+SB15.capacity());







        }
    }

