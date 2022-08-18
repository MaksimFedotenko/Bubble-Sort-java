import java.util.Arrays;
public class Shell_Sort {
    public static void main(String[] args)
    {
        int[] array = {11, 64, 10, 3, 21, 2, 5};
        System.out.println(Arrays.toString(array));
// ����������� ���������� ����� ������������ ����������
        int gap = array.length / 2;
// ���� ������� ����� ���������� ����
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                // ������� ������ ���������, ���� �� ������ ����� �����, ���
                // ����� ��� � ��������� �� ���� �� ����� ������� ����������
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            // ������������� ������
            gap = gap / 2;
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
