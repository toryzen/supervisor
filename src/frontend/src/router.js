const routers = [{
    path: '/',
    meta: {
        title: ''
    },
    component: (resolve) => require(['./views/index.vue'], resolve)
},{
        path: '/home',
        meta: {
            title: ''
        },
        component: (resolve) => require(['./views/home/index.vue'], resolve)
    },{
    path: '/app',
    meta: {
        title: ''
    },
    component: (resolve) => require(['./views/app/index.vue'], resolve)
    },{
    path: '/manage',
    meta: {
        title: ''
    },
    component: (resolve) => require(['./views/manage/index.vue'], resolve)
}
];
export default routers;