/**
 * Created by Paopao on 08/10/17.
 */
public interface Tree<D extends Comparable> {

    public boolean isEmpty();

    public int cardinality();

    public boolean member(D elt);

    public NonEmptyBST<D> add(D elt);
}
