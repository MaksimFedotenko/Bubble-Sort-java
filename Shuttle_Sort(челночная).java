import java.util.Arrays;
public class Shuttle_Sort {
    public static void main(String[] args)
    {
        int[] array = {11, 23, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            // ����������� �������� ��������
            int value = array[left];
            // ������������ �� ���������, ������� ����� ���������� ���������
            int i = left - 1;
            for (; i >= 0; i--) {
                // ���� �������� �������� ������� � ����������� ������� ������� ������
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // ���� ���������� ������� ������ � ���������������
                    break;
                }
            }
            // � �������������� ����� ��������� ���������� ��������
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}



