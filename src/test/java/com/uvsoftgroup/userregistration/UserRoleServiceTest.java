package com.uvsoftgroup.userregistration;

import com.uvsoftgroup.userregistration.model.UserRegistration;
import com.uvsoftgroup.userregistration.model.UserRole;
import com.uvsoftgroup.userregistration.service.UserRegistrationService;
import com.uvsoftgroup.userregistration.service.UserRoleService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleServiceTest {
    private @Autowired UserRegistrationService userRegistrationService;
    private @Autowired UserRoleService userRoleService;
    @Test
    @Ignore
    public void saveUserRole() {
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.setUserAddressId(1000L);

        UserRole userRoleA=new UserRole();
        userRoleA.setUserRoleType("AD1");
        userRoleA.setUserRegistration(userRegistration);

        UserRole userRoleB=new UserRole();
        userRoleB.setUserRoleType("AD2");
        userRoleB.setUserRegistration(userRegistration);
       List<UserRole> roleList=new ArrayList<>();
        roleList.add(userRoleB);
        roleList.add(userRoleA);

        userRegistration.setUserRoles(roleList);

        UserRegistration userRegistration1 = userRegistrationService.createUserRegistration(userRegistration);
        System.out.println(userRegistration1.getId());
    }
}
