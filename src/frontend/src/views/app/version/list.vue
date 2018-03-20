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
                        title: 'Ver',
                        key: 'ver'
                    },
                    {
                        title: 'State',
                        key: 'stat'
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
                                        type: 'success',
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
                                }, 'O'),
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
                        id:1,
                        ver: '0.0.3',
                        stat: 'online'
                    },
                    {
                        id:2,
                        ver: '0.0.2',
                        stat: 'offline'
                    }
                ]
            };
        },
        methods: {
            remove (index){
                //if(window.confirm('make sure to do sth!')){
                    axios.post('/api/app/version/delete',{appid:this.$route.query.id,id:this.data1[index].id}).then(function (response) {
                        if(response.data.flag==true){
                            this.$Modal.success({title :'Delete Message',content:response.data.message,okText:'Close'});
                            this.data1.splice(index,1);
                        }else{
                            this.$Modal.warning({title :'Delete Message',content:response.data.message,okText:'Close'});
                        }
                    }.bind(this)).catch(function (error) {
                        this.$Modal.error({title :'Server Error',content:error.message,okText:'Close'});
                    }.bind(this));
                //}else{
                    return false;
               // }
            }
        }
    };
</script>