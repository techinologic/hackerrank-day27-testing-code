/**
 * Created by Paopao on 08/10/17.
 */
public class BinarySearchTree {

    public static void main(String[] args) throws Exception {

        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);

        Testers.checkIsEmpty(e);
        Testers.checkIsEmpty(n);

        Testers.checkAddMemberCardinalityIsEmpty(e, 5);
        Testers.checkAddMemberCardinalityIsEmpty(n, 5);
        Testers.checkAddMemberCardinalityIsEmpty(n, 6);


    }
}
