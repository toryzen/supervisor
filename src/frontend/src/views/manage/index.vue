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
                    <BreadcrumbItem>Manage</BreadcrumbItem>
                    <a style="float: right" href="/home"><Icon type="arrow-return-left"></Icon> Return</a>
                </Breadcrumb>
                <Table size="small" :columns="columns1" :data="data1"></Table>
            </Content>
            <Footer><m-footer></m-footer></Footer>
        </Layout>
    </div>
</template>
<script>
    const axios = require('axios');
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
                        title: 'Username',
                        key: 'username',
                    },
                    {
                        title: 'Create Time',
                        key: 'createtime',
                    },
                    {
                        title: 'Last Login Time',
                        key: 'lastlogintime'
                    }
                    ,
                    {
                        title: 'Last Login Ip',
                        key: 'lastloginip'
                    },
                    {
                        title: 'Action',
                        key: 'action',
                        width: '200px',
                        align: 'center',
                        render: (h, params) => {
                            return h('div', [
                                h('Button', {
                                    props: {
                                        type: 'primary',
                                        size: 'small'
                                    },
                                    style: {
                                        marginRight: '3px'
                                    },
                                    on: {
                                        click: () => {
                                            this.remove(params.index);
                                        }
                                    }
                                }, 'Edit'),
                                h('Button', {
                                    props: {
                                        type: 'error',
                                        size: 'small'
                                    },
                                    on: {
                                        click: () => {
                                            this.remove(params.index);
                                        }
                                    }
                                }, 'Delete')
                            ]);
                        }
                    }
                ],
                data1: [
                    {
                        username: 'huangzhen',
                        createtime: '2018/03/06 17:42',
                        lastlogintime:'2018/03/06 17:42',
                        lastloginip:'115.182.1.4'
                    },
                    {
                        username: 'huangzhen',
                        createtime: '2018/03/06 17:42',
                        lastlogintime:'2018/03/06 17:42',
                        lastloginip:'115.182.1.4'
                    }
                ]
            };
        }
        ,
        methods: {
            remove (index){
                axios.post('/api/manage/delete',{id:this.data1[index].id}).then(function (response) {
                    if(response.data.flag==true){
                        this.$Modal.success({title :'Delete Message',content:response.data.message,okText:'Close'});
                        this.data1.splice(index,1);
                    }else{
                        this.$Modal.warning({title :'Delete Message',content:response.data.message,okText:'Close'});
                    }
                }.bind(this)).catch(function (error) {
                    this.$Modal.error({title :'Server Error',content:error.message,okText:'Close'});
                }.bind(this));
            }
        }
    };
</script>