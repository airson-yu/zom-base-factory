package com.zom.factory.script.sql;

public class Table_rtv_beacon_location {

    public static void main(String[] args) {
        generateInsertSQL();
    }

    public static void generateInsertSQL() {
        StringBuilder sb = new StringBuilder(1000);
        String sql_base = "INSERT INTO `rtv_beacon_location`(`loc_name`, `tg_id`, `loc_mark`, `status`, `owner_id`, `role_id`, `corp_id`, `updirection`, `downdirection`, `updateTime`, `metroline`, `order`, `message`) " +
                "VALUES ";
        sb.append(sql_base);

        // (28, '西直门', 00000074053, '{\"loc_lat\":39.940474,\"loc_lon\":116.355426}', 01, 0, 44, 2, 0, 180, '2019-01-11 10:28:00', '2')";

        String[] data = {
                //`loc_name`, `tg_id`, `loc_mark`, `status`, `owner_id`, `role_id`, `corp_id`, `updirection`, `downdirection`, `updateTime`, `metroline`, `order`, `message`
                //"位置名称,群组ID(主键ID),经度,纬度,部门ID,组织ID,上行,下行,线路,序号(非必填，默认为ID*100，无值就填NULL),语音(非必填，默认为空，无值就填NULL)",
                "科学城,99227,30.391243,104.072328,163,1,0,180,1,NULL,NULL",
                "兴隆湖,99228,30.405196,104.076412,163,1,0,180,1,NULL,NULL",
                "广州路,99229,30.419021,104.077269,163,1,0,180,1,NULL,NULL",
                "西博城,99230,30.425071,104.077264,163,1,0,180,1,NULL,NULL",
                "天府公园,99231,30.432976,104.077748,163,1,0,180,1,NULL,NULL",
                "武汉路,99232,30.441619,104.07291,163,1,0,180,1,NULL,NULL",
                "麓湖,99233,30.454527,104.073293,163,1,0,180,1,NULL,NULL",
                "红石公园,99234,30.464257,104.073007,163,1,0,180,1,NULL,NULL",
                "广福,99235,30.478693,104.069325,163,1,0,180,1,NULL,NULL",
                "海昌路,99236,30.492778,104.071583,163,1,0,180,1,NULL,NULL",
                "华阳,99237,30.503167,104.070521,163,1,0,180,1,NULL,NULL",
                "五根松,99238,30.502041,104.081369,163,1,0,180,1,NULL,NULL",
                "广都,99239,30.510752,104.075713,163,1,0,180,1,NULL,NULL",
                "四河,99240,30.516133,104.070125,163,1,0,180,1,NULL,NULL",
                "华府大道,99241,30.525746,104.069836,163,1,0,180,1,NULL,NULL",
                "天府五街,99242,30.537107,104.06951,163,1,0,180,1,NULL,NULL",
                "天府三街,99243,30.546203,104.069204,163,1,0,180,1,NULL,NULL",
                "世纪城,99244,30.55487,104.06893,163,1,0,180,1,NULL,NULL",
                "锦城广场,99245,30.567722,104.066528,163,1,0,180,1,NULL,NULL",
                "孵化园,99246,30.575873,104.064313,163,1,0,180,1,NULL,NULL",
                "金融城,99247,30.58257,104.064147,163,1,0,180,1,NULL,NULL",
                "高新,99248,30.59436,104.063847,163,1,0,180,1,NULL,NULL",
                "火车南站,99249,30.60545,104.067393,163,1,0,180,1,NULL,NULL",
                "桐梓林,99250,30.61531,104.067115,163,1,0,180,1,NULL,NULL",
                "倪家桥,99251,30.62477,104.066885,163,1,0,180,1,NULL,NULL",
                "省体育馆,99252,30.63336,104.066606,163,1,0,180,1,NULL,NULL",
                "华西坝,99253,30.64282,104.066279,163,1,0,180,1,NULL,NULL",
                "锦江宾馆,99254,30.65004,104.066053,163,1,0,180,1,NULL,NULL",
                "天府广场,99255,30.65745,104.065751,163,1,0,180,1,NULL,NULL",
                "骡马市,99256,30.66651,104.065617,163,1,0,180,1,NULL,NULL",
                "文殊院,99257,30.67253,104.068036,163,1,0,180,1,NULL,NULL",
                "人民北路,99259,30.68483,104.073056,163,1,0,180,1,NULL,NULL",
                "火车北站,99261,30.69551,104.074056,163,1,0,180,1,NULL,NULL",
                "升仙湖,99262,30.70462,104.083474,163,1,0,180,1,NULL,NULL",
                "韦家碾,99264,30.717644,104.08686,163,1,0,180,1,NULL,NULL",
                "犀浦,99315,30.758172,103.971433,223,1,180,0,2,NULL,NULL",
                "天河路,99318,30.745883,103.976163,223,1,180,0,2,NULL,NULL",
                "百草路,99321,30.733062,103.979327,223,1,180,0,2,NULL,NULL",
                "金周路,99324,30.721638,103.996175,223,1,180,0,2,NULL,NULL",
                "金科北路,99326,30.720762,104.006635,223,1,180,0,2,NULL,NULL",
                "迎宾大道,99329,30.713168,104.013528,223,1,180,0,2,NULL,NULL",
                "茶店子客运站,99332,30.705986,104.013692,223,1,180,0,2,NULL,NULL",
                "羊犀立交,99336,30.693913,104.012655,223,1,180,0,2,NULL,NULL",
                "一品天下,99339,30.688942,104.01963,223,1,180,0,2,NULL,NULL",
                "蜀汉路东,99341,30.682868,104.029048,223,1,180,0,2,NULL,NULL",
                "白果林,99345,30.673851,104.033278,223,1,180,0,2,NULL,NULL",
                "中医大省医院,99346,30.666106,104.040612,223,1,90,0,2,NULL,NULL",
                "通惠门,99349,30.662088,104.048523,223,1,90,270,2,NULL,NULL",
                "人民公园,99352,30.659324,104.056779,223,1,90,270,2,NULL,NULL",
                "天府广场,99354,30.657453,104.065751,223,1,90,270,2,NULL,NULL",
                "春熙路,99357,30.653389,104.080019,223,1,90,270,2,NULL,NULL",
                "东门大桥,99360,30.648192,104.087308,223,1,90,270,2,NULL,NULL",
                "牛王庙,99361,30.644976,104.094483,223,1,90,270,2,NULL,NULL",
                "牛市口,99363,30.637912,104.107662,223,1,90,270,2,NULL,NULL",
                "东大路,99365,30.633167,104.112897,223,1,90,270,2,NULL,NULL",
                "塔子山公园,99366,30.629465,104.122922,223,1,90,270,2,NULL,NULL",
                "成都东客站,99367,30.62933,104.140357,223,1,90,0,2,NULL,NULL",
                "成渝立交,99368,30.624822,104.147432,223,1,180,0,2,NULL,NULL",
                "惠王陵,99369,30.612075,104.152086,223,1,90,0,2,NULL,NULL",
                "洪河,99370,30.605015,104.15751,223,1,90,270,2,NULL,NULL",
                "成都行政学院,99371,30.596975,104.170954,223,1,90,270,2,NULL,NULL",
                "大面铺,99372,30.5924,104.201298,223,1,90,270,2,NULL,NULL",
                "连山坡,99373,30.58758,104.212757,223,1,90,270,2,NULL,NULL",
                "界牌,99374,30.582802,104.225134,223,1,90,270,2,NULL,NULL",
                "书房,99375,30.575626,104.242134,223,1,90,270,2,NULL,NULL",
                "龙平路,99376,30.572923,104.258988,223,1,90,270,2,NULL,NULL",
                "龙泉驿,99377,30.560111,104.267966,223,1,90,270,2,NULL,NULL",
                "万盛,99274,30.675357,103.818887,266,1,90,270,4,NULL,NULL",
                "杨柳河,99267,30.680905,103.831101,266,1,90,270,4,NULL,NULL",
                "凤溪河,99280,30.686109,103.843043,266,1,90,270,4,NULL,NULL",
                "南熏大道,99281,30.689571,103.851779,266,1,90,270,4,NULL,NULL",
                "光华公园,99283,30.684316,103.860554,266,1,90,270,4,NULL,NULL",
                "涌泉,99285,30.678405,103.873069,266,1,90,270,4,NULL,NULL",
                "凤凰大街,99287,30.676944,103.889513,266,1,90,270,4,NULL,NULL",
                "马厂坝,99290,30.677424,103.913802,266,1,90,270,4,NULL,NULL",
                "非遗博览园,99293,30.674086,103.922478,266,1,90,270,4,NULL,NULL",
                "蔡桥,99295,30.669474,103.945088,266,1,90,270,4,NULL,NULL",
                "中坝,99297,30.673492,103.96411,266,1,90,270,4,NULL,NULL",
                "成都西站,99300,30.683429,103.976595,266,1,90,270,4,NULL,NULL",
                "清江西路,99302,30.676605,103.998588,266,1,90,270,4,NULL,NULL",
                "文化宫,99306,30.672258,104.009413,266,1,90,270,4,NULL,NULL",
                "西南财大,99310,30.670471,104.020118,266,1,90,270,4,NULL,NULL",
                "草堂北路,99313,30.669095,104.028185,266,1,90,270,4,NULL,NULL",
                "中医大省医院,99316,30.666106,104.040612,266,1,90,270,4,NULL,NULL",
                "宽窄巷子,99320,30.665381,104.050679,266,1,90,270,4,NULL,NULL",
                "骡马市,99323,30.666514,104.065617,266,1,90,270,4,NULL,NULL",
                "太升南路,99327,30.664767,104.076578,266,1,90,270,4,NULL,NULL",
                "市二医院,99331,30.660814,104.083909,266,1,90,270,4,NULL,NULL",
                "玉双路,99334,30.653452,104.099315,266,1,90,270,4,NULL,NULL",
                "双桥路,99338,30.646975,104.113278,266,1,90,270,4,NULL,NULL",
                "万年场,99342,30.644231,104.119188,266,1,90,270,4,NULL,NULL",
                "槐树店,99348,30.648877,104.139309,266,1,90,270,4,NULL,NULL",
                "来龙,99351,30.646859,104.164475,266,1,90,270,4,NULL,NULL",
                "十陵,99356,30.645829,104.172438,266,1,90,270,4,NULL,NULL",
                "成都大学,99359,30.646689,104.181182,266,1,90,270,4,NULL,NULL",
                "明蜀王陵,99362,30.648178,104.196346,266,1,90,270,4,NULL,NULL",
                "西河,99364,30.647276,104.220298,266,1,90,270,4,NULL,NULL",
                "回龙,99378,30.444594,104.011886,305,1,0,180,5,NULL,NULL",
                "龙马路,99379,30.457463,104.01984,305,1,0,180,5,NULL,NULL",
                "怡心湖,99380,30.471185,104.026786,305,1,0,180,5,NULL,NULL",
                "南湖立交,99381,30.488471,104.033106,305,1,0,180,5,NULL,NULL",
                "二江寺,99382,30.499615,104.035727,305,1,0,180,5,NULL,NULL",
                "警官学院,99383,30.512303,104.039691,305,1,0,180,5,NULL,NULL",
                "骑龙,99384,30.525565,104.044347,305,1,0,180,5,NULL,NULL",
                "民乐,99385,30.540348,104.046521,305,1,0,180,5,NULL,NULL",
                "大源,99386,30.549826,104.046226,305,1,0,180,5,NULL,NULL",
                "锦城湖,99387,30.563758,104.046135,305,1,0,180,5,NULL,NULL",
                "锦城大道,99388,30.574165,104.050468,305,1,0,180,5,NULL,NULL",
                "交子大道,99389,30.581854,104.05021,305,1,0,180,5,NULL,NULL",
                "市一医院,99391,30.589302,104.050548,305,1,0,180,5,NULL,NULL",
                "石羊立交,99393,30.595183,104.050842,305,1,0,180,5,NULL,NULL",
                "神仙树,99395,30.610057,104.048098,305,1,0,180,5,NULL,NULL",
                "九兴大道,99397,30.620681,104.039868,305,1,0,180,5,NULL,NULL",
                "科园,99399,30.628044,104.037829,305,1,0,180,5,NULL,NULL",
                "高升桥,99402,30.640044,104.042545,305,1,0,180,5,NULL,NULL",
                "省骨科医院,99404,30.651835,104.040973,305,1,0,180,5,NULL,NULL",
                "青羊宫,99407,30.660007,104.040773,305,1,0,180,5,NULL,NULL",
                "中医大省医院,99409,30.666106,104.040612,305,1,0,180,5,NULL,NULL",
                "抚琴,99411,30.677314,104.042105,305,1,0,180,5,NULL,NULL",
                "花牌坊,99413,30.683479,104.04784,305,1,0,180,5,NULL,NULL",
                "西北桥,99415,30.685632,104.058153,305,1,0,180,5,NULL,NULL",
                "北站西二路,99417,30.693759,104.066153,305,1,0,180,5,NULL,NULL",
                "赛云台,99420,30.7006,104.066503,305,1,0,180,5,NULL,NULL",
                "五块石,99422,30.707379,104.064554,305,1,0,180,5,NULL,NULL",
                "福宁路,99425,30.714537,104.059827,305,1,0,180,5,NULL,NULL",
                "洞子口,99427,30.721527,104.058471,305,1,0,180,5,NULL,NULL",
                "泉水路,99429,30.730369,104.058375,305,1,0,180,5,NULL,NULL",
                "陆家桥,99433,30.742274,104.059091,305,1,0,180,5,NULL,NULL",
                "皇花园,99434,30.752331,104.059721,305,1,0,180,5,NULL,NULL",
                "石犀公园,99435,30.760279,104.059768,305,1,0,180,5,NULL,NULL",
                "大丰,99436,30.771615,104.065109,305,1,0,180,5,NULL,NULL",
                "杜家碾,99437,30.771585,104.075258,305,1,0,180,5,NULL,NULL",
                "九道堰,99438,30.771588,104.082896,305,1,0,180,5,NULL,NULL",
                "幸福桥,99439,30.776951,104.088262,305,1,0,180,5,NULL,NULL",
                "北部商贸城,99440,30.791089,104.088961,305,1,0,180,5,NULL,NULL",
                "廖家湾,99441,30.80836,104.090959,305,1,0,180,5,NULL,NULL",
                "柏水场,99442,30.815507,104.094232,305,1,0,180,5,NULL,NULL",
                "华桂路,99443,30.825126,104.098314,305,1,0,180,5,NULL,NULL",
                "兰家沟,99258,30.44326,103.996609,359,1,180,0,6,NULL,NULL",
                "回龙,99260,30.444594,104.011886,359,1,180,0,6,NULL,NULL",
                "钓鱼嘴,99263,30.435997,104.032764,359,1,180,0,6,NULL,NULL",
                "松林,99265,30.426123,104.046099,359,1,180,0,6,NULL,NULL",
                "秦皇寺,99266,30.42447,104.061794,359,1,180,0,6,NULL,NULL",
                "西博城,99267,30.424349,104.074399,359,1,90,0,6,NULL,NULL",
                "天府商务区,99268,30.430137,104.086434,359,1,90,270,6,NULL,NULL",
                "杭州路,99269,30.440033,104.089584,359,1,90,270,6,NULL,NULL",
                "昌公堰,99270,30.448783,104.09484,359,1,0,270,6,NULL,NULL",
                "沈阳路,99271,30.466947,104.101578,359,1,0,180,6,NULL,NULL",
                "麓山大道,99272,30.483542,104.103143,359,1,0,180,6,NULL,NULL",
                "万安,99273,30.495409,104.09937,359,1,0,180,6,NULL,NULL",
                "蒲草塘,99275,30.501697,104.09839,359,1,0,180,6,NULL,NULL",
                "龙灯山,99277,30.509374,104.101387,359,1,0,180,6,NULL,NULL",
                "新川路,99278,30.516069,104.100218,359,1,0,180,6,NULL,NULL",
                "新通大道,99279,30.522093,104.098487,359,1,0,180,6,NULL,NULL",
                "观东,99282,30.530972,104.098335,359,1,0,180,6,NULL,NULL",
                "陆肖,99284,30.537797,104.098365,359,1,0,180,6,NULL,NULL",
                "张家寺,99286,30.550135,104.09838,359,1,0,180,6,NULL,NULL",
                "中和,99288,30.558558,104.096073,359,1,0,180,6,NULL,NULL",
                "金融城东,99289,30.579232,104.084286,359,1,0,180,6,NULL,NULL",
                "金石路,99291,30.590616,104.089283,359,1,0,180,6,NULL,NULL",
                "琉三路,99292,30.600351,104.098172,359,1,0,180,6,NULL,NULL",
                "琉璃场,99294,30.607534,104.10064,359,1,0,180,6,NULL,NULL",
                "东光,99296,30.61963,104.097323,359,1,0,180,6,NULL,NULL",
                "三官堂,99298,30.628648,104.094637,359,1,0,180,6,NULL,NULL",
                "顺江路,99299,30.635579,104.093005,359,1,0,180,6,NULL,NULL",
                "牛王庙,99301,30.644976,104.094483,359,1,0,180,6,NULL,NULL",
                "玉双路,99303,30.653452,104.099315,359,1,0,180,6,NULL,NULL",
                "新鸿路,99304,30.662072,104.102366,359,1,0,180,6,NULL,NULL",
                "建设北路,99305,30.671021,104.098845,359,1,0,180,6,NULL,NULL",
                "前锋路,99307,30.679037,104.092124,359,1,270,180,6,NULL,NULL",
                "梁家巷,99308,30.682223,104.083659,359,1,270,90,6,NULL,NULL",
                "人民北路,99309,30.684833,104.073056,359,1,270,90,6,NULL,NULL",
                "西北桥,99311,30.685632,104.058153,359,1,270,90,6,NULL,NULL",
                "沙湾,99312,30.69091,104.050854,359,1,270,90,6,NULL,NULL",
                "西南交大,99314,30.694387,104.049053,359,1,0,90,6,NULL,NULL",
                "星河,99317,30.7035,104.043174,359,1,0,180,6,NULL,NULL",
                "金府,99319,30.711658,104.036758,359,1,0,180,6,NULL,NULL",
                "西华大道,99322,30.718886,104.031274,359,1,0,180,6,NULL,NULL",
                "青杠,99325,30.725647,104.025824,359,1,0,180,6,NULL,NULL",
                "兴盛,99328,30.730837,104.021554,359,1,0,180,6,NULL,NULL",
                "侯家桥,99330,30.73776,104.004242,359,1,0,180,6,NULL,NULL",
                "梓潼宫,99333,30.747951,103.993248,359,1,270,180,6,NULL,NULL",
                "兴业北街,99335,30.75871,103.983352,359,1,270,90,6,NULL,NULL",
                "犀浦,99337,30.758172,103.971433,359,1,270,90,6,NULL,NULL",
                "天宇路,99340,30.754105,103.954694,359,1,270,90,6,NULL,NULL",
                "红高路,99343,30.76967,103.93673,359,1,0,90,6,NULL,NULL",
                "尚锦路,99344,30.777418,103.923294,359,1,0,180,6,NULL,NULL",
                "檬梓,99347,30.784888,103.91411,359,1,0,180,6,NULL,NULL",
                "蜀新大道,99350,30.791329,103.903076,359,1,0,180,6,NULL,NULL",
                "郫筒,99353,30.796068,103.894501,359,1,0,180,6,NULL,NULL",
                "和平街,99355,30.80031,103.887526,359,1,0,180,6,NULL,NULL",
                "望丛祠,99358,30.807559,103.877728,359,1,0,180,6,NULL,NULL",
                "莲花,99390,30.54625,103.979376,426,1,90,270,8,NULL,NULL",
                "文星,99392,30.550592,103.990564,426,1,0,270,8,NULL,NULL",
                "川大江安校区,99394,30.555238,104.007095,426,1,0,180,8,NULL,NULL",
                "珠江路,99396,30.566315,104.008057,426,1,0,180,8,NULL,NULL",
                "顺丰,99398,30.577149,104.010964,426,1,0,180,8,NULL,NULL",
                "三元,99400,30.581891,104.025848,426,1,0,180,8,NULL,NULL",
                "石羊,99401,30.585472,104.031122,426,1,0,180,8,NULL,NULL",
                "庆安,99403,30.598394,104.033988,426,1,0,180,8,NULL,NULL",
                "殷家林,99405,30.605928,104.03435,426,1,0,180,8,NULL,NULL",
                "高朋大道,99406,30.617319,104.03266,426,1,0,180,8,NULL,NULL",
                "九兴大道,99408,30.620681,104.039868,426,1,90,270,8,NULL,NULL",
                "永丰,99410,30.628165,104.046902,426,1,90,270,8,NULL,NULL",
                "芳草街,99412,30.626041,104.052352,426,1,90,270,8,NULL,NULL",
                "倪家桥,99414,30.624773,104.066885,426,1,90,270,8,NULL,NULL",
                "川大望江校区,99416,30.625187,104.075629,426,1,90,270,8,NULL,NULL",
                "东湖公园,99418,30.619992,104.088291,426,1,90,270,8,NULL,NULL",
                "东光,99409,30.61963,104.097323,426,1,90,270,8,NULL,NULL",
                "净居寺,99421,30.623043,104.104838,426,1,0,270,8,NULL,NULL",
                "东大路,99423,30.633167,104.112897,426,1,0,180,8,NULL,NULL",
                "双桥路,99424,30.646975,104.113278,426,1,0,180,8,NULL,NULL",
                "万年路,99426,30.65481,104.114948,426,1,0,180,8,NULL,NULL",
                "杉板桥,99428,30.66417,104.119292,426,1,0,180,8,NULL,NULL",
                "东郊记忆,99430,30.668561,104.129064,426,1,0,180,8,NULL,NULL",
                "理工大学,99431,30.674182,104.135198,426,1,0,180,8,NULL,NULL",
                "十里店,99432,30.681911,104.146789,426,1,0,180,8,NULL,NULL",

        };

        //int roleid = 16;

        /**
         *  XXX XXX status默认为0，即位置未绑定信标，在导入信标的时候再手动更新位置的status为1
         */

        String ts = "2021-01-27 17:54:00";

        for (String i : data) {
            String[] item = i.split(",");
            //int size = item.length;
            //"位置名称,群组ID,经度,纬度,部门ID,组织ID,上行,下行,线路,序号(非必填，默认为ID*100),语音(非必填，默认为空)",
            String name = item[0];
            String tgid = item[1];
            String lat = item[2];
            String lon = item[3];
            String roleId = item[4];
            String corpId = item[5];
            String up = item[6];
            String down = item[7];
            String line = item[8];
            String order = item[9];
            String message = item[10];
            //order = order.equalsIgnoreCase("NULL") ? "" : order;
            message = message.equalsIgnoreCase("NULL") ? "NULL" : ("'" + message + "'");

            String loc_json = "{\"loc_lat\":" + lat + ",\"loc_lon\":" + lon + "}";

            sb.append("\n('" + name + "', " + tgid + ", '" + loc_json + "', 0, 0, " + roleId + ", " + corpId + ", " + up + ", " + down + ", '" + ts + "', '" + line + "', " + order + ", " + message + "),");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(";");

        //更新 ORDER
        sb.append("\nUPDATE rtv_beacon_location SET `order` = id * 100 WHERE `order` IS NULL;");

        System.out.println(sb.toString());

    }

}

