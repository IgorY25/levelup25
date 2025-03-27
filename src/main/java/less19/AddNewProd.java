package less19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddNewProd {
    public static void newProduct(Connection connection) throws Exception {
        String sqlSelect = """
                select cl.id as number, tС.name as type,cl.name as name from clients cl --клиенты
                inner join type_client tС on tС.id = cl.type_client_ref and tС.external
                order by cl.id;
                """;
        String sqlInsert = """
                insert into product(unit_ref, name)
                                values (?, ?);
                """;
        String sqlSelectTypePar = """
                select count(id) as count
                from measure_unit
                where id = ?;
                """;
        PreparedStatement statement;
        PreparedStatement statementHelp;
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        ResultSet resultSet = null;
        System.out.println("Ввод новой продукции в справочник");
        statement = connection.prepareStatement(sqlInsert);
        statementHelp = connection.prepareStatement(sqlSelectTypePar);
        System.out.println("Введите id единицы измерения");
        if (scanner.hasNext()) {
            int intRes = scanner.nextInt();
            System.out.println("Вы ввели id %d".formatted(intRes));

            statementHelp.setInt(1, intRes);
            try {
                resultSet = statementHelp.executeQuery();
                resultSet.next();
                result = resultSet.getInt("count");
                if (result > 0) {
                    System.out.println("id единицы измерениявведен успешно");
                } else {
                    System.out.println("Ошибка ввода id единицы измерения");
                    return;
                }
            } catch (SQLException e) {
                System.out.println("Ошибка ввода: " + e.toString());
                return;
            }
            String strRet = null;
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
            System.out.println("Введите наименование продукции");
            if (scanner.hasNextLine()) {
                strRet = scanner.nextLine();
                System.out.println("Вы ввели наименование " + strRet);

                statement.setInt(1, intRes);
                statement.setString(2, strRet);
                try {
                    result = statement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("Ошибка ввода: " + e.toString());
                    return;
                }
                System.out.println("Количество введенных записей: " + result);
            }
        }
        System.out.println("");
    }
}
