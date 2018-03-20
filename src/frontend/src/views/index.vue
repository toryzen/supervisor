<style scoped>
    .index {
        width: 100%;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        text-align: center;
    }

    .index h1 {
        height: 150px;
    }

    .index h1 img {
        height: 100%;
    }

    .index h2 {
        color: #666;
        margin-bottom: 10px;
    }

    .index h2 p {
        margin: 0 0 50px;
    }

    .index .ivu-row-flex {
        height: 100%;
    }
</style>
<template>
    <div class="index">
        <Row type="flex" justify="center" align="middle">
            <Col span="24">
                <h1>
                    <img src="../images/logo.png">
                </h1>
                <h2>
                    <p>Elves Supervisor</p>
                </h2>
                <div><Input v-model="username" placeholder="username" style="width: 300px"></Input></div>
                <br/>
                <div><Input v-model="pwd" placeholder="password" style="width: 300px" type="password"></Input></div>
                <br/>
                <Button type="ghost" @click="handleStart">Login</Button>
            </Col>
        </Row>
    </div>
</template>
<script>
    const axios = require('axios');
    export default {
        methods: {
            handleStart() {
                axios.post('/api/login',{passwd:this.pwd,username:this.username}).then(function (response) {
                    if(response.data.flag==true){
                        this.$router.push({path:'/home'});
                    }else{
                        this.$Modal.warning({title :'Login Message',content:response.data.message,okText:'Close'});
                    }
                }.bind(this)).catch(function (error) {
                    this.$Modal.warning({title :'Server Error',content:error.message,okText:'Close'});
                }.bind(this));
            }
        }
    };
</script>