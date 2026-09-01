package Model;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    private final Map<String, String> PhoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        PhoneBook.put(phone, name);
    }

    public String findNameByPhone(String phone) {
        return PhoneBook.getOrDefault(phone, "Unknown number");
    }

    public List<String> findAllPhonesByName(String name) {
        return PhoneBook.entrySet().stream()
                .filter(x -> x.getValue().equalsIgnoreCase(name))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

}

