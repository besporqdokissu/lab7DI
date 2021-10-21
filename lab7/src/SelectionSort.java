class SelectionSort implements ISorter {

    @Override
    public void sort(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            byte max = array[i];
            byte max_i = (byte) i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_i = (byte) j;
                }
            }
            if (i != max_i) {
                byte tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
    }
}