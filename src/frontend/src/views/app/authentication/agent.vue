<style scoped>
</style>
<template>
    <Table size="small" :columns="columns1" :data="data1"></Table>
</template>
<script>
    const axios = require('axios');
    export default {
        data(){
            return{
                columns1: [
                    {
                        title: 'Agent Ip ',
                        key: 'ip',
                        width:'150px;'
                    },
                    {
                        title: 'Remark',
                        key: 'rmk'
                    },
                    {
                        title: 'Action',
                        key: 'action',
                        width: '90px',
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
                                            this.remove(params.index)
                                        }
                                    }
                                }, 'E'),
                                h('Button', {
                                    props: {
                                        type: 'error',
                                        size: 'small'
                                    },
                                    on: {
                                        click: () => {
                                            this.remove(params.index)
                                        }
                                    }
                                }, 'D')
                            ]);
                        }
                    }
                ],
                data1: [
                    {
                        id: 1,
                        ip: '115.182.1.2',
                        rmk:'WEB自动化运维'
                    },
                    {
                        id: 2,
                        ip: '42.62.121.5',
                        rmk:'XX管理项目'
                    }
                ]
            };
        },
        methods: {
            remove (index){
                axios.post('/api/app/agent/delete',{appid:this.$route.query.id,id:this.data1[index].id}).then(function (response) {
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
    }
</script>