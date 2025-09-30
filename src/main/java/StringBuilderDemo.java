public class StringBuilderDemo {
    public static void main(String[] args) {

// create a StringBuillder object
        StringBuilder builder = new StringBuilder();

// append strings to the StringBuilder object
        builder.append("Git, ");
        builder.append("HTML, ");
        builder.append("CSS, ");
        builder.append("and Bootstrap\n");
        builder.append("JavaScript, ");
        builder.append("ES6, ");
        builder.append("jQuery, ");
        builder.append("REST APIs, ");
        builder.append("and Express\n");
        builder.append("Angular\n");
        builder.append("Java\n");
// retrieve the underlying characters from
// the StringBuilder
        String mySkills = builder.toString();
        System.out.println(mySkills);
    }
}

