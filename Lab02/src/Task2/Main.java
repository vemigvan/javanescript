package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User("Vova",20, 180.5, "PD32", "loshara", "vov@kekmail.com" ));
        users.add(new User("Vika",17, 160d, "PD12", "palladin_ka", "winx@kekmail.com" ));
        users.add(new User("Slavik",18, 177.4, "PD31", "loshara", "rinatahmetov@kekmail.com" ));
        users.add(new User("Alexandra",22, 170d, "PD22", "vranova1234", "alexa@kekmail.com" ));
        users.add(new User("Andrei",16, 188d, "PD11", "harakiri", "barash@kekmail.com" ));

        List<UserDto> usersDto = users.stream().filter(user -> user.getAge()>=18).map(UserMapper::mapToDto).collect(Collectors.toList());
        //users.stream().forEach(user -> System.out.println(user.getName()));
        //usersDto.stream().forEach(user -> System.out.println(user.getName()));
    }
}
