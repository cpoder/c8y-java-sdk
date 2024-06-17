package org.cpo.c8y.configuration;

import org.cpo.c8y.Platform;
import org.cpo.c8y.annotation.TenantScope;
import org.cpo.c8y.api.AlarmsApi;
import org.cpo.c8y.api.ApplicationBinariesApi;
import org.cpo.c8y.api.ApplicationVersionsApi;
import org.cpo.c8y.api.ApplicationsApi;
import org.cpo.c8y.api.AttachmentsApi;
import org.cpo.c8y.api.AuditsApi;
import org.cpo.c8y.api.BinariesApi;
import org.cpo.c8y.api.BootstrapUserApi;
import org.cpo.c8y.api.BulkOperationsApi;
import org.cpo.c8y.api.ChildOperationsApi;
import org.cpo.c8y.api.CurrentApplicationApi;
import org.cpo.c8y.api.CurrentUserApi;
import org.cpo.c8y.api.DeviceCredentialsApi;
import org.cpo.c8y.api.DevicePermissionsApi;
import org.cpo.c8y.api.DeviceStatisticsApi;
import org.cpo.c8y.api.EventsApi;
import org.cpo.c8y.api.ExternalIdsApi;
import org.cpo.c8y.api.GroupsApi;
import org.cpo.c8y.api.InventoryRolesApi;
import org.cpo.c8y.api.LoginOptionsApi;
import org.cpo.c8y.api.LoginTokensApi;
import org.cpo.c8y.api.ManagedObjectsApi;
import org.cpo.c8y.api.MeasurementsApi;
import org.cpo.c8y.api.NewDeviceRequestsApi;
import org.cpo.c8y.api.OperationsApi;
import org.cpo.c8y.api.OptionsApi;
import org.cpo.c8y.api.RetentionRulesApi;
import org.cpo.c8y.api.RolesApi;
import org.cpo.c8y.api.SubscriptionsApi;
import org.cpo.c8y.api.SystemOptionsApi;
import org.cpo.c8y.api.TenantApplicationsApi;
import org.cpo.c8y.api.TenantsApi;
import org.cpo.c8y.api.TokensApi;
import org.cpo.c8y.api.TrustedCertificatesApi;
import org.cpo.c8y.api.UsageStatisticsApi;
import org.cpo.c8y.api.UsersApi;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class TenantConfig {
    private final Platform platform;

    @Configuration
    @Primary
    class TenantScopeConfig {
        @Bean(name = { "alarmsApi", "tenantAlarmsApi" })
        @TenantScope
        @Primary
        public AlarmsApi getAlarmsApi() {
            return platform.buildClient(AlarmsApi.class);
        }

        @Bean(name = { "applicationBinariesApi", "tenantApplicationBinariesApi" })
        @TenantScope
        @Primary
        public ApplicationBinariesApi getApplicationBinariesApi() {
            return platform.buildClient(ApplicationBinariesApi.class);
        }

        @Bean(name = { "applicationsApi" })
        @TenantScope
        @Primary
        public ApplicationsApi getApplicationsApi() {
            return platform.buildClient(ApplicationsApi.class);
        }

        @Bean(name = { "applicationVersionsApi", "tenantApplicationVersionsApi" })
        @TenantScope
        @Primary
        public ApplicationVersionsApi getApplicationVersionsApi() {
            return platform.buildClient(ApplicationVersionsApi.class);
        }

        @Bean(name = { "attachmentsApi", "tenantAttachmentsApi" })
        @TenantScope
        @Primary
        public AttachmentsApi getAttachmentsApi() {
            return platform.buildClient(AttachmentsApi.class);
        }

        @Bean(name = { "auditsApi", "tenantAuditsApi" })
        @TenantScope
        @Primary
        public AuditsApi getAuditsApi() {
            return platform.buildClient(AuditsApi.class);
        }

        @Bean(name = { "binariesApi", "tenantBinariesApi" })
        @TenantScope
        @Primary
        public BinariesApi getBinariesApi() {
            return platform.buildClient(BinariesApi.class);
        }

        @Bean(name = { "bootstrapUserApi", "tenantBootstrapUserApi" })
        @TenantScope
        @Primary
        public BootstrapUserApi getBootstrapUserApi() {
            return platform.buildClient(BootstrapUserApi.class);
        }

        @Bean(name = { "bulkOperationsApi", "tenantBulkOperationsApi" })
        @TenantScope
        @Primary
        public BulkOperationsApi getBulkOperationsApi() {
            return platform.buildClient(BulkOperationsApi.class);
        }

        @Bean(name = { "childOperationsApi", "tenantChildOperationsApi" })
        @TenantScope
        @Primary
        public ChildOperationsApi getChildOperationsApi() {
            return platform.buildClient(ChildOperationsApi.class);
        }

        @Bean(name = { "currentApplicationApi", "tenantCurrentApplicationApi" })
        @TenantScope
        @Primary
        public CurrentApplicationApi getCurrentApplicationApi() {
            return platform.buildClient(CurrentApplicationApi.class);
        }

        @Bean(name = { "currentUserApi", "tenantCurrentUserApi" })
        @TenantScope
        @Primary
        public CurrentUserApi getCurrentUserApi() {
            return platform.buildClient(CurrentUserApi.class);
        }

        @Bean(name = { "deviceCredentialsApi", "tenantDeviceCredentialsApi" })
        @TenantScope
        @Primary
        public DeviceCredentialsApi getDeviceCredentialsApi() {
            return platform.buildClient(DeviceCredentialsApi.class);
        }

        @Bean(name = { "devicePermissionsApi", "tenantDevicePermissionsApi" })
        @TenantScope
        @Primary
        public DevicePermissionsApi getDevicePermissionsApi() {
            return platform.buildClient(DevicePermissionsApi.class);
        }

        @Bean(name = { "deviceStatisticsApi", "tenantDeviceStatisticsApi" })
        @TenantScope
        @Primary
        public DeviceStatisticsApi getDeviceStatisticsApi() {
            return platform.buildClient(DeviceStatisticsApi.class);
        }

        @Bean(name = { "eventsApi", "tenantEventsApi" })
        @TenantScope
        @Primary
        public EventsApi getEventsApi() {
            return platform.buildClient(EventsApi.class);
        }

        @Bean(name = { "externalIdsApi", "tenantExternalIdsApi" })
        @TenantScope
        @Primary
        public ExternalIdsApi getExternalIdsApi() {
            return platform.buildClient(ExternalIdsApi.class);
        }

        @Bean(name = { "groupsApi", "tenantGroupsApi" })
        @TenantScope
        @Primary
        public GroupsApi getGroupsApi() {
            return platform.buildClient(GroupsApi.class);
        }

        @Bean(name = { "inventoryRolesApi", "tenantInventoryRolesApi" })
        @TenantScope
        @Primary
        public InventoryRolesApi getInventoryRolesApi() {
            return platform.buildClient(InventoryRolesApi.class);
        }

        @Bean(name = { "loginOptionsApi", "tenantLoginOptionsApi" })
        @TenantScope
        @Primary
        public LoginOptionsApi getLoginOptionsApi() {
            return platform.buildClient(LoginOptionsApi.class);
        }

        @Bean(name = { "loginTokensApi", "tenantLoginTokensApi" })
        @TenantScope
        @Primary
        public LoginTokensApi getLoginTokensApi() {
            return platform.buildClient(LoginTokensApi.class);
        }

        @Bean(name = { "managedObjectsApi", "tenantManagedObjectsApi" })
        @TenantScope
        @Primary
        public ManagedObjectsApi getManagedObjectsApi() {
            return platform.buildClient(ManagedObjectsApi.class);
        }

        @Bean(name = { "measurementsApi", "tenantMeasurementsApi" })
        @TenantScope
        @Primary
        public MeasurementsApi getMeasurementsApi() {
            return platform.buildClient(MeasurementsApi.class);
        }

        @Bean(name = { "newDeviceRequestsApi", "tenantNewDeviceRequestsApi" })
        @TenantScope
        @Primary
        public NewDeviceRequestsApi getNewDeviceRequestsApi() {
            return platform.buildClient(NewDeviceRequestsApi.class);
        }

        @Bean(name = { "operationsApi", "tenantOperationsApi" })
        @TenantScope
        @Primary
        public OperationsApi getOperationsApi() {
            return platform.buildClient(OperationsApi.class);
        }

        @Bean(name = { "optionsApi", "tenantOptionsApi" })
        @TenantScope
        @Primary
        public OptionsApi getOptionsApi() {
            return platform.buildClient(OptionsApi.class);
        }

        @Bean(name = { "retentionRulesApi", "tenantRetentionRulesApi" })
        @TenantScope
        @Primary
        public RetentionRulesApi getRetentionRulesApi() {
            return platform.buildClient(RetentionRulesApi.class);
        }

        @Bean(name = { "rolesApi", "tenantRolesApi" })
        @TenantScope
        @Primary
        public RolesApi getRolesApi() {
            return platform.buildClient(RolesApi.class);
        }

        @Bean(name = { "subscriptionsApi", "tenantSubscriptionsApi" })
        @TenantScope
        @Primary
        public SubscriptionsApi getSubscriptionsApi() {
            return platform.buildClient(SubscriptionsApi.class);
        }

        @Bean(name = { "systemOptionsApi", "tenantSystemOptionsApi" })
        @TenantScope
        @Primary
        public SystemOptionsApi getSystemOptionsApi() {
            return platform.buildClient(SystemOptionsApi.class);
        }

        @Bean(name = { "tenantApplicationsApi" })
        @TenantScope
        @Primary
        public TenantApplicationsApi getTenantApplicationsApi() {
            return platform.buildClient(TenantApplicationsApi.class);
        }

        @Bean(name = { "tenantsApi", "tenantTenantsApi" })
        @TenantScope
        @Primary
        public TenantsApi getTenantsApi() {
            return platform.buildClient(TenantsApi.class);
        }

        @Bean(name = { "tokensApi", "tenantTokensApi" })
        @TenantScope
        @Primary
        public TokensApi getTokensApi() {
            return platform.buildClient(TokensApi.class);
        }

        @Bean(name = { "trustedCertificatesApi", "tenantTrustedCertificatesApi" })
        @TenantScope
        @Primary
        public TrustedCertificatesApi getTrustedCertificatesApi() {
            return platform.buildClient(TrustedCertificatesApi.class);
        }

        @Bean(name = { "usageStatisticsApi", "tenantUsageStatisticsApi" })
        @TenantScope
        @Primary
        public UsageStatisticsApi getUsageStatisticsApi() {
            return platform.buildClient(UsageStatisticsApi.class);
        }

        @Bean(name = { "usersApi", "tenantUsersApi" })
        @TenantScope
        @Primary
        public UsersApi getUsersApi() {
            return platform.buildClient(UsersApi.class);
        }
    }

    @Configuration
    class UserScopeConfig {
        @Bean(name = { "userAlarmsApi" })
        @TenantScope
        public AlarmsApi getAlarmsApi() {
            return platform.buildUserClient(AlarmsApi.class);
        }

        @Bean(name = { "userApplicationBinariesApi" })
        @TenantScope
        public ApplicationBinariesApi getApplicationBinariesApi() {
            return platform.buildUserClient(ApplicationBinariesApi.class);
        }

        @Bean(name = { "userApplicationsApi" })
        @TenantScope
        public ApplicationsApi getApplicationsApi() {
            return platform.buildUserClient(ApplicationsApi.class);
        }

        @Bean(name = { "userApplicationVersionsApi" })
        @TenantScope
        public ApplicationVersionsApi getApplicationVersionsApi() {
            return platform.buildUserClient(ApplicationVersionsApi.class);
        }

        @Bean(name = { "userAttachmentsApi" })
        @TenantScope
        public AttachmentsApi getAttachmentsApi() {
            return platform.buildUserClient(AttachmentsApi.class);
        }

        @Bean(name = { "userAuditsApi" })
        @TenantScope
        public AuditsApi getAuditsApi() {
            return platform.buildUserClient(AuditsApi.class);
        }

        @Bean(name = { "userBinariesApi" })
        @TenantScope
        public BinariesApi getBinariesApi() {
            return platform.buildUserClient(BinariesApi.class);
        }

        @Bean(name = { "userBootstrapUserApi" })
        @TenantScope
        public BootstrapUserApi getBootstrapUserApi() {
            return platform.buildUserClient(BootstrapUserApi.class);
        }

        @Bean(name = { "userBulkOperationsApi" })
        @TenantScope
        public BulkOperationsApi getBulkOperationsApi() {
            return platform.buildUserClient(BulkOperationsApi.class);
        }

        @Bean(name = { "userChildOperationsApi" })
        @TenantScope
        public ChildOperationsApi getChildOperationsApi() {
            return platform.buildUserClient(ChildOperationsApi.class);
        }

        @Bean(name = { "userCurrentApplicationApi" })
        @TenantScope
        public CurrentApplicationApi getCurrentApplicationApi() {
            return platform.buildUserClient(CurrentApplicationApi.class);
        }

        @Bean(name = { "userCurrentUserApi" })
        @TenantScope
        public CurrentUserApi getCurrentUserApi() {
            return platform.buildUserClient(CurrentUserApi.class);
        }

        @Bean(name = { "userDeviceCredentialsApi" })
        @TenantScope
        public DeviceCredentialsApi getDeviceCredentialsApi() {
            return platform.buildUserClient(DeviceCredentialsApi.class);
        }

        @Bean(name = { "userDevicePermissionsApi" })
        @TenantScope
        public DevicePermissionsApi getDevicePermissionsApi() {
            return platform.buildUserClient(DevicePermissionsApi.class);
        }

        @Bean(name = { "userDeviceStatisticsApi" })
        @TenantScope
        public DeviceStatisticsApi getDeviceStatisticsApi() {
            return platform.buildUserClient(DeviceStatisticsApi.class);
        }

        @Bean(name = { "userEventsApi" })
        @TenantScope
        public EventsApi getEventsApi() {
            return platform.buildUserClient(EventsApi.class);
        }

        @Bean(name = { "userExternalIdsApi" })
        @TenantScope
        public ExternalIdsApi getExternalIdsApi() {
            return platform.buildUserClient(ExternalIdsApi.class);
        }

        @Bean(name = { "userGroupsApi" })
        @TenantScope
        public GroupsApi getGroupsApi() {
            return platform.buildUserClient(GroupsApi.class);
        }

        @Bean(name = { "userInventoryRolesApi" })
        @TenantScope
        public InventoryRolesApi getInventoryRolesApi() {
            return platform.buildUserClient(InventoryRolesApi.class);
        }

        @Bean(name = { "userLoginOptionsApi" })
        @TenantScope
        public LoginOptionsApi getLoginOptionsApi() {
            return platform.buildUserClient(LoginOptionsApi.class);
        }

        @Bean(name = { "userLoginTokensApi" })
        @TenantScope
        public LoginTokensApi getLoginTokensApi() {
            return platform.buildUserClient(LoginTokensApi.class);
        }

        @Bean(name = { "userManagedObjectsApi" })
        @TenantScope
        public ManagedObjectsApi getManagedObjectsApi() {
            return platform.buildUserClient(ManagedObjectsApi.class);
        }

        @Bean(name = { "userMeasurementsApi" })
        @TenantScope
        public MeasurementsApi getMeasurementsApi() {
            return platform.buildUserClient(MeasurementsApi.class);
        }

        @Bean(name = { "userNewDeviceRequestsApi" })
        @TenantScope
        public NewDeviceRequestsApi getNewDeviceRequestsApi() {
            return platform.buildUserClient(NewDeviceRequestsApi.class);
        }

        @Bean(name = { "userOperationsApi" })
        @TenantScope
        public OperationsApi getOperationsApi() {
            return platform.buildUserClient(OperationsApi.class);
        }

        @Bean(name = { "userOptionsApi" })
        @TenantScope
        public OptionsApi getOptionsApi() {
            return platform.buildUserClient(OptionsApi.class);
        }

        @Bean(name = { "userRetentionRulesApi" })
        @TenantScope
        public RetentionRulesApi getRetentionRulesApi() {
            return platform.buildUserClient(RetentionRulesApi.class);
        }

        @Bean(name = { "userRolesApi" })
        @TenantScope
        public RolesApi getRolesApi() {
            return platform.buildUserClient(RolesApi.class);
        }

        @Bean(name = { "userSubscriptionsApi" })
        @TenantScope
        public SubscriptionsApi getSubscriptionsApi() {
            return platform.buildUserClient(SubscriptionsApi.class);
        }

        @Bean(name = { "userSystemOptionsApi" })
        @TenantScope
        public SystemOptionsApi getSystemOptionsApi() {
            return platform.buildUserClient(SystemOptionsApi.class);
        }

        @Bean(name = { "userTenantApplicationsApi" })
        @TenantScope
        public TenantApplicationsApi getTenantApplicationsApi() {
            return platform.buildUserClient(TenantApplicationsApi.class);
        }

        @Bean(name = { "userTenantsApi" })
        @TenantScope
        public TenantsApi getTenantsApi() {
            return platform.buildUserClient(TenantsApi.class);
        }

        @Bean(name = { "userTokensApi" })
        @TenantScope
        public TokensApi getTokensApi() {
            return platform.buildUserClient(TokensApi.class);
        }

        @Bean(name = { "userTrustedCertificatesApi" })
        @TenantScope
        public TrustedCertificatesApi getTrustedCertificatesApi() {
            return platform.buildUserClient(TrustedCertificatesApi.class);
        }

        @Bean(name = { "userUsageStatisticsApi" })
        @TenantScope
        public UsageStatisticsApi getUsageStatisticsApi() {
            return platform.buildUserClient(UsageStatisticsApi.class);
        }

        @Bean(name = { "userUsersApi" })
        @TenantScope
        public UsersApi getUsersApi() {
            return platform.buildUserClient(UsersApi.class);
        }
    }

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new TenantBeanFactoryPostProcessor();
    }

}
