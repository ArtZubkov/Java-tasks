
public class Main {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] strMatrix = new String[][]{
                {"5", "43", "79", "63"},
                {"35", "77", "401", "27"},
                {"94", "89", "18", "572"},
                {"768", "109", "1672", "6"}
        };
        task(strMatrix);
    }

    public static void task(String[][] strMatrix) throws MyArraySizeException, MyArrayDataException {
        try {
            int items = 0;
            for (String[] arr : strMatrix) {
                items += arr.length;
            }
            if (strMatrix.length != 4 || items != 16) {
                throw new MyArraySizeException("Incorrect size of matrix!");
            }

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

        int sum = 0;
        int ind1 = 0, ind2 = 0;

        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    ind1 = i;
                    ind2 = j;
                    sum += Integer.parseInt(strMatrix[i][j]);
                }
            }

        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Conversion failed! \n Element: [" + ind1 + "][" + ind2 + "]");
        } finally {
            System.out.println("Sum: " + sum);
        }

    }


}