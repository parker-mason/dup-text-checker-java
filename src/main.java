public class Main
{
    public static void main(String[] args)
    {
        String string1 = "dog";

        String string2 = "dog";

        checkForDuplicateText(string1, string2);

    }

    public static String checkForDuplicateText(String s1, String s2)
    {
        char[] sArray1 = new char[s1.length()];
        char[] sArray2 = new char[s2.length()];

        int stringIndex = 0;

        String[] numberSuffixArray = {"st", "nd", "rd", "th"};

        for (int i = 0; i < s1.length(); i++)
        {
            sArray1[stringIndex] = s1.charAt(i);
            stringIndex++;
        }

        stringIndex = 0;

        for (int i = 0; i < s2.length(); i++)
        {
            sArray2[stringIndex] = s2.charAt(i);
            stringIndex++;
        }

        for (int i = 0; i < s1.length(); i++)
        {            
            if (sArray1[i] == sArray2[i])
            {

                int number = i;

                String numberSuffix = "";
                switch (i)
                {
                    case 0:
                        numberSuffix = numberSuffixArray[0];
                        break;
                    case 1:
                        numberSuffix = numberSuffixArray[1];
                        break;
                    case 2:
                        numberSuffix = numberSuffixArray[2];
                        break;
                    default:
                        numberSuffix = numberSuffixArray[3];
                        break;
                }

                System.out.println("The " + (number + 1) + numberSuffix + " letters are the same for both strings");
            }
            else
            {

            }
        }

        return s1;
    }
}