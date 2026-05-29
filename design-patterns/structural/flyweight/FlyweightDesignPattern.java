package backend-engineering.design-patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightDesignPattern {

  public static void main(String[] args) {

    Role adminRole1 = RoleFactory.getRole("ADMIN");
    Role adminRole2 = RoleFactory.getRole("ADMIN");

    adminRole1.showRole("101");
    adminRole2.showRole("102");

    System.out.println(adminRole1 == adminRole2);
  }
}

// Real-world examples:
// String Pool
// User Roles
// Shared Metadata
// Caching Systems

class Role {

  private final String roleName;

  public Role(String roleName) {
    this.roleName = roleName;
  }

  public void showRole(String userId) {
    System.out.println(
        "User Id: " + userId +
        ", Role: " + roleName);
  }
}

class RoleFactory {

  private static final Map<String, Role> ROLES =
      new HashMap<>();

  public static Role getRole(String roleName) {

    return ROLES.computeIfAbsent(
        roleName,
        Role::new);
  }
}
