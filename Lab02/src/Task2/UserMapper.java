package Task2;

import java.util.List;

public class UserMapper {

    public static UserDto mapToDto(User user){
        return new UserDto(user.getName(),user.getAge(),user.getEmail());
    }

    public static User mapToUser(UserDto userDto){
        return new User(userDto.getName(),userDto.getAge(),180d, "PD31","0000", userDto.getEmail());
    }
}
