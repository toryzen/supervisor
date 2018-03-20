<style scoped>
    @import "../../style/common.css";
</style>
<template>
    <div class="layout">
        <Layout>
            <Header><m-header></m-header></Header>
            <Content :style="{padding: '0 200px'}">
                <Breadcrumb :style="{margin: '20px 0'}">
                    <BreadcrumbItem>Home</BreadcrumbItem>
                    <BreadcrumbItem>App</BreadcrumbItem>
                    <a style="float: right" href="/"><Icon type="log-out"></Icon> Logout</a>
                </Breadcrumb>
                <Table size="small" :columns="columns1" :data="data1"></Table>
            </Content>
            <Footer><m-footer></m-footer></Footer>
        </Layout>
    </div>
</template>
<script>
    import mHeader from '../public/header.vue';
    import mFooter from '../public/footer.vue';
    export default {
        components: {
            mHeader,
            mFooter,
        },
        data(){
            return{
                columns1: [
                    {
                        title: 'App Name',
                        key: 'name',
                        width:'200px'
                    },
                    {
                        title: 'Instruct',
                        key: 'ins',
                        width:'100px'
                    },
                    {
                        title: 'Introduce',
                        key: 'intro'
                    },
                    {
                        title: 'Version',
                        key: 'ver',
                        render: (h, params) => {
                            const row = params.row;
                            return h('Button',{
                                props: {
                                    type: 'success',
                                    size:'small'
                                }
                            },row.ver);
                        },
                        width:'80px'
                    },
                    {
                        title: 'Authentication',
                        key: 'authe',
                        render: (h, params) => {
                            const row = params.row;
                            return h('Button',{
                                props: {
                                    type: 'primary',
                                    size:'small'
                                }
                            },row.authe);
                        },
                        width:'120px'
                    },
                    {
                        title: 'Authorization',
                        key: 'autho',
                        render: (h, params) => {
                            const row = params.row;
                            return h('Button',{
                                props: {
                                    type: 'info',
                                    size:'small'
                                }
                            },row.autho);
                        },
                        width:'120px'
                    },
                    {
                        title: 'Setting',
                        key: 'mng',
                        render: (h, params) => {
                            const row = params.row;
                            return h('Button',{
                                props: {
                                    type: 'warning',
                                    size:'small'
                                },
                                on: {
                                    click: () => {
                                        this.$router.push({path:'/app?id='+row.id});
                                    }
                                }
                            },'Detail');
                        },
                        width:'90px'
                    },
                ],
                data1: [
                    {
                        id: 1,
                        name: '基础模块',
                        ins: 'base',
                        intro:'项目介绍！项目介绍！项目介绍！项目介绍！项目介绍！',
                        ver: '0.0.1',
                        authe: '13R | 1U | 10A',
                        autho: '3 Keys',
                    },
                    {
                        id: 2,
                        name: 'WEB自动化运维',
                        ins: 'webops',
                        intro:'项目介绍！项目介绍！项目介绍！项目介绍！项目介绍！',
                        ver: '0.0.1',
                        authe: '13R | 1U | 10A',
                        autho: '3 Keys',
                    },
                    {
                        id: 3,
                        name: '问道管理项目',
                        ins: 'wdops',
                        intro:'项目介绍！项目介绍！项目介绍！项目介绍！项目介绍！',
                        ver: '0.0.1',
                        authe: '13R | 1U | 10A',
                        autho: '3 Keys',
                    },
                    {
                        id: 4,
                        name: 'odin安全检测',
                        ins: 'odin',
                        intro:'项目介绍！项目介绍！项目介绍！项目介绍！项目介绍！',
                        ver: '0.0.1',
                        authe: '13R | 1U | 10A',
                        autho: '3 Keys',
                    }
                ]
            };
        }
    };
</script>