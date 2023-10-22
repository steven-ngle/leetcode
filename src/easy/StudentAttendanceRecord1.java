package easy;

public class StudentAttendanceRecord1 {

    public boolean checkRecord(String s) {

        int absent = 0;
        char[] arr = s.toCharArray();

        for (Character c : arr) {
            if (c == 'A') {
                absent++;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == 'L' && arr[i+1] == 'L' && arr[i+2] == 'L') {
                return false;
            }
        }

        return absent < 2;
    }
}
