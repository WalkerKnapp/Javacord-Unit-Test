package org.javacord.unittest.entity.permission;

import org.javacord.api.entity.permission.PermissionState;
import org.javacord.api.entity.permission.PermissionType;
import org.javacord.api.entity.permission.Permissions;
import org.javacord.api.entity.permission.internal.PermissionsBuilderDelegate;

public class PermissionsBuilderDelegateImpl implements PermissionsBuilderDelegate {
    public PermissionsBuilderDelegateImpl(Permissions permissions) {

    }

    public PermissionsBuilderDelegateImpl() {

    }

    @Override
    public void setState(PermissionType type, PermissionState state) {

    }

    @Override
    public PermissionState getState(PermissionType type) {
        return null;
    }

    @Override
    public Permissions build() {
        return null;
    }
}
