package sorting;

/**
 * This class is used to create a sorter for the sorting type specified.
 */
public class SortingTypeArgumentHandler extends AbstractArgumentHandler<SortingType> {
    private Sorter dataSorter;

    public SortingTypeArgumentHandler(SortingType sortingType) {
        super(sortingType);    }

    /**
     * Initializes the data sorter for the specified sorting type.
     * This method should be called only once after the SortingTypeArgument is created.
     * @throws IllegalStateException if the data sorter could not be created.
     */
    @Override
    public void execute() {
        Sorter dataSorter = SorterFactory.create(argument);
        assert dataSorter != null;
        setSorter(dataSorter);
    }

    private void setSorter(Sorter dataSorter) {
        this.dataSorter = dataSorter;
    }

    public Sorter getSorter() {
        return dataSorter;
    }
}
