class ArrayUtil implements IArray {


    public void printArray(byte[] arr) {
        for (int j : arr) {
            System.out.printf("%d ", j);
        }
        System.out.println();
    }

    public byte[] stringToByteArray(String array) {
        String[] stringAry = array.split(" ");
        byte[] byteAry = new byte[stringAry.length];
        for (int i = 0; i < stringAry.length; i++) {
            byteAry[i] = Byte.parseByte(stringAry[i]);
        }

        return byteAry;
    }
}