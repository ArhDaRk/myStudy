public class Main {
    public static void main(String[] args) {
        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука Лукич"};
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
                ,"Аммос Федорович: Как ревизор?"
                ,"Артемий Филиппович: Как ревизор?"
                ,"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
                ,"Аммос Федорович: Вот те на!"
                ,"Артемий Филиппович: Вот не было заботы, так подай!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"
                ,"Лука Лукич: нет!"};
        System.out.println(printTextPerRole(roles,textLines));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder testOut = new StringBuilder();
        String[] numberOfTextLine = new String[textLines.length];
        for (int i = 0; i < textLines.length; i++){
            numberOfTextLine[i] = i + 1 + ")" + textLines[i];
        }
        for (int name = 0; name < roles.length; name++) {
            if (name != 0) {
                testOut.append("\n");
            }
            testOut.append(roles[name]).append(":").append("\n");
            for (String nameRole : numberOfTextLine) {
                if (nameRole.startsWith(roles[name] + ":",nameRole.indexOf(")")+1)) {
                    testOut.append(nameRole, 0, nameRole.indexOf(roles[name])).append(nameRole.substring(nameRole.indexOf(":") + 1)).append("\n");
                }
            }
            if (name == roles.length - 1){
                testOut.delete(testOut.length() - 1,testOut.length());
            }
        }
        return testOut.toString();
    }
}

