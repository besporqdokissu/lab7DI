import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MainModule extends AbstractModule{

    protected void configure(){

        bind(ISorter.class).annotatedWith(Names.named("bubble")).to(BubbleSort.class);

        bind(ISorter.class).annotatedWith(Names.named("selection")).to(SelectionSort.class);

        bind(ISorter.class).annotatedWith(Names.named("insertion")).to(InsertionSort.class);

    }
}
