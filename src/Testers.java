/**
 * Created by Paopao on 08/14/17.
 */
public class Testers {

    public static void checkIsEmpty(Tree t) throws Exception {
        // if the Tree t is an instance of EmptyBST -> t.isEmpty -> true
        // if the Tree f is an instance of NonEmptyBST -> t.isEmpty -> false
        if (t instanceof EmptyBST) {
            if (!t.isEmpty()) {
                throw new Exception("All is good. Tree is NonEmptyBST" +
                        " and it is not empty ");
            } else if (t instanceof NonEmptyBST) {
                if (t.isEmpty()) {
                    throw new Exception("All is good. Tree is EmptyBST" +
                            " and it is empty ");
                }
            }
        }
    }

    public static void checkAddMemberCardinalityIsEmpty(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        //Either something was added > and cardinality increased by 1
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("Cardinality increase by 1, but the thing that was" +
                        " added was already member of the tree.");
            } else {
                System.out.println("All is good, our cardinality increase and the things" +
                        " wasn't added in the tree");
            }
            // Or the thing that was added was already there and not really added.
        } else if (nT == t.cardinality()) {
            if (!t.member(x)) {
                throw new Exception("The cardinality did not increase by 1 but" +
                        " we added a new thing");
            } else {
                System.out.println("All is good, the thing was in the tree our " +
                        "cardinality didn't increase ");
            }
        } else {
            throw new Exception("Something is wrong with our program!");
        }
    }
}
