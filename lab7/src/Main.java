import com.google.inject.Binding;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new MainModule());
        Scanner scanner = new Scanner(System.in);
        IArray arrayUtil = new ArrayUtil();

        String array = scanner.nextLine();
        String sortType = scanner.nextLine();

        Binding<ISorter> binding = injector.getExistingBinding(Key.get(ISorter.class, Names.named(sortType)));
        if (binding == null) {
            System.out.println("That's illegal.");
            return;
        }

        try {
            byte[] byteArray = arrayUtil.stringToByteArray(array);
            ISorter instance = binding.getProvider().get();
            instance.sort(byteArray);
            arrayUtil.printArray(byteArray);
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
