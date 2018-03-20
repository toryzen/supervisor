<style scoped>
@import "../../style/common.css";
</style>
<template>
    <div class="layout">
        <Layout>
            <Header>
                <m-header></m-header>
            </Header>
            <Content :style="{padding: '0 200px'}">
                <Breadcrumb :style="{margin: '20px 0'}">
                    <BreadcrumbItem>Home</BreadcrumbItem>
                    <BreadcrumbItem>App</BreadcrumbItem>
                    <a style="float: right" href="/home"><Icon type="arrow-return-left"></Icon> Return</a>
                </Breadcrumb>

                <h1 style="margin-top:15px;text-align: center">{{ apptitie }}</h1>
                <h2 style="text-align: center">{{ appins }}</h2>
                <div style="text-align: center">{{ appintro }}</div>
                <hr style="margin: 15px 0 15px 0">
                <Row   :gutter="16" style="margin-top: 15px;">
                    <Col span="5">
                        <h2 style="margin-bottom: 10px;">Version</h2>
                        <versionlist-table></versionlist-table>
                    </Col>
                    <Col span="9">
                        <h2 style="margin-bottom: 10px;">Authorization</h2>
                        <authlist-table></authlist-table>
                    </Col>
                    <Col span="10">
                        <h2 style="margin-bottom: 10px;">Authentication</h2>
                        <Tabs type="card">
                            <TabPane label="regular expression"><regular-table style="margin-top: -17px;"></regular-table></TabPane>
                            <TabPane label="restful api"><restful-table style="margin-top: -17px;"></restful-table></TabPane>
                            <TabPane label="agent ip"><agent-table style="margin-top: -17px;"></agent-table></TabPane>
                        </Tabs>
                    </Col>
                </Row>

            </Content>
            <Footer class="layout-footer-center"><m-footer></m-footer></Footer>
        </Layout>
    </div>
</template>
<script>
    import mHeader from '../public/header.vue';
    import mFooter from '../public/footer.vue';
    import regularTable from './authentication/regular.vue';
    import restfulTable from './authentication/restful.vue';
    import agentTable from './authentication/agent.vue';
    import authlistTable from './authorization/list.vue';
    import versionlistTable from './version/list.vue';
    export default {
        components: {
            mHeader,
            mFooter,
            authlistTable,
            regularTable,
            restfulTable,
            agentTable,
            versionlistTable
        },
        data(){
            return{
                apptitie : '基础模块',
                appins :'base',
                appintro :'项目介绍！项目介绍！项目介绍！项目介绍！'
            }
        }
    }
</script>