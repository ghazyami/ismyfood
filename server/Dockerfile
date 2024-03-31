FROM payara/micro
RUN echo "fish.payara.tenantcontrol.blocking.disable=true" > /opt/payara/payara.properties
COPY target/*.war $DEPLOY_DIR
CMD ["--systemproperties", "/opt/payara/payara.properties", "--deploymentDir", "/opt/payara/deployments", "--contextroot", "ROOT"]