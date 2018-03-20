<style scoped>
</style>
<template>
    <can-edit-table size="small" :columns="columns1" :data="data1" :saveEdit="saveEditInline" :deleteRow="deleteRowInline"></can-edit-table>
</template>
<script>
    import canEditTable from '../../public/components/canEditTable.vue';
    const axios = require('axios');

    export default {
        components: {
            canEditTable
        },
        data(){
            return{
                columns1 : [
                    {
                        title: '姓名',
                        align: 'center',
                        key: 'name',
                        width: 120,
                        editable: true
                    },
                    {
                        title: '岗位',
                        align: 'center',
                        width: 160,
                        key: 'work',
                        editable: true
                    },
                    {
                        title: '操作',
                        align: 'center',
                        width: 120,
                        key: 'handle',
                        handle: ['delete']
                    }
                ],
                data1 : [
                    {
                        name: 'Aresn',
                        work: '前端开发'
                    },
                    {
                        name: 'Lison',
                        work: '前端开发'
                    },
                    {
                        name: 'lisa',
                        work: '程序员鼓励师'
                    }
                ]
            };
        },
        methods: {
            handleNetConnect (state) {
                this.breakConnect = state;
            },
            handleLowSpeed (state) {
                this.lowNetSpeed = state;
            },
            saveEdit (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以保存失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('保存成功');
                        });
                    }
                }, delay);
            },
            deleteRow (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以删除失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('删除数据成功~');
                        });
                    }
                }, delay);
            },
            saveEditInline (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以保存失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('保存成功');
                        });
                    }
                }, delay);
            },
            deleteRowInline (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以删除失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('删除数据成功~');
                        });
                    }
                }, delay);
            },
            saveEditIncell (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以保存失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('保存成功');
                        });
                    }
                }, delay);
            },
            deleteRowIncell (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以删除失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('删除数据成功~');
                        });
                    }
                }, delay);
            },
            saveEditInlineIncell (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以保存失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('保存成功');
                        });
                    }
                }, delay);
            },
            deleteRowInlineIncell (index, success, fail) {
                let delay = 0;
                if (this.lowNetSpeed) {
                    delay = 1000;
                }
                setTimeout(() => {
                    if (this.breakConnect) {
                        fail(() => {
                            this.$Message.error('服务器嫌弃你的网络，所以删除失败');
                        });
                    } else {
                        success(() => {
                            this.$Message.success('删除数据成功~');
                        });
                    }
                }, delay);
            },
            getCurrentData () {
                this.showCurrentTableData = true;
            }
        },
        created () {
        }
    };
</script>