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
                        title: 'Auth ID',
                        key: 'aid'
                    },
                    {
                        title: 'Auth Key',
                        key: 'akey'
                    }
                    ,
                    {
                        title: 'Memo',
                        key: 'memo'
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
                                            this.edit(params.index);
                                        }
                                    }
                                }, 'E'),
                                h('Poptip', {
                                    props: {
                                        confirm: true,
                                        title: 'Confirm Deletions?',
                                        transfer: true,
                                        'ok-text':'YES',
                                        'cancel-text' : 'NO'
                                    },
                                    on: {
                                        'on-ok': () => {
                                            this.remove(params.index);
                                        }
                                    }
                                }, [
                                    h('Button', {
                                        props: {
                                            type: 'error',
                                            placement: 'top',
                                            size: 'small'
                                            //loading: currentRow.isDeleting
                                        }
                                    }, 'D')
                                ])
                            ]);
                        }
                    }
                ],
                data1: [
                    {
                        aid: 'AAB4D95DA15F7E86',
                        akey: '40A2F680F77F988E',
                        memo:'WEB自动化运维'
                    },
                    {
                        aid: 'DEABDA0FCCA3F0C4',
                        akey: '11394E03471DF391',
                        memo:'问道管理项目'
                    }
                ]
            };
        },
        methods: {
            edit (index){
                console.log(this.data1[index]);
                this.data1[index].edittingCell[]
            },
            remove (index){
                axios.post('/api/app/authorization/delete',{appid:this.$route.query.id,id:this.data1[index].aid}).then(function (response) {
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