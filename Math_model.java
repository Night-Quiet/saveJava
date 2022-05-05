/**
 目录--------------------------------------------------------------------------
 * 2020年全国大学生数学建模竞赛B题第一题
 * 2020年全国大学生数学建模竞赛B题第二题
 * 2020年全国大学生数学建模竞赛B题第三题
 * 2020年全国大学生数学建模竞赛B题第四题
 * 2020年全国大学生数学建模竞赛B题第五题
 * 2020年全国大学生数学建模竞赛B题第六题
 *
 * 2021年美国大学生数学建模竞赛C题
 * 数据7/3分训练集测试机
*/

/**2020年全国大学生数学建模竞赛B题第一题**/
//public class Math_model {
//    public static void main(String[] args) {
//        int heavy = 1200;  /**负重上线1200kg**/
//        int day = 30; /**时间30天**/
//        int money = 10000; /**初始资金10000元**/
//        int earn = 1000; /**基础收益1000元**/
//        int[] water = {3,5}; /**水每箱质量3kg、每箱基准价格5元**/
//        int[] food = {2,10}; /**食物每箱质量2kg、每箱基准价格10元**/
//        int[] sun = {5,7}; /**晴天水消耗5箱，食物消耗7箱**/
//        int[] hot = {8,6}; /**高温水消耗8箱，食物消耗6箱**/
//        int[] sand = {10,10}; /**沙暴水消耗10箱，食物消耗10箱**/
//        int[] weather = {0,2,2,1,3,1,2,3,1,2,2,3,2,1,2,2,2,3,3,2,2,1,1,2,1,3,2,1,1,2,2};
//        /**天气情况：1代表晴朗、2代表高温、3代表沙暴**/
//        /**路线思路：尽可能多的在矿洞里面呆，尽可能进入矿洞的次数最少。**/
//        /**为达到目标，在进矿洞之前物资补给充分，出矿洞后物资保留去到村庄即可**/
//        int[] resources_begin = {0,0};
//        int go_day = 1;
//        int[] money_tony=new int[31];
//        int[] water_tony=new int[31];
//        int[] food_tony=new int[31];
//        int money_remain=money-(245*5+211*10);
//        int water_remain=245;
//        int food_remain=211;
//        money_tony[0]=money_remain;
//        water_tony[0]=water_remain;
//        food_tony[0]=food_remain;
//        System.out.println("开始剩余资金："+money_remain);
//        System.out.println("开始剩余水量： "+water_remain + "开始剩余食物量："+food_remain);
//        int begin_village = 6; /**在最短路Matlab算的为6**/
//        for (;go_day<=begin_village;go_day++) {
//            if (weather[go_day] == 1) {
//                resources_begin[0] += sun[0]*2*water[0];
//                resources_begin[1] += sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day] == 2) {
//                resources_begin[0] += hot[0]*2*water[0];
//                resources_begin[1] += hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day] == 3) {
//                resources_begin[0] += sand[0]*water[0];
//                resources_begin[1] += sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                begin_village++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        } /**根据沙暴停一天原理，算的在第八天到村庄**/
//        System.out.println("到达村庄的天数："+(go_day-1));
//        System.out.println("到达村庄需要物资："+resources_begin[0]+" "+resources_begin[1]);
//        System.out.println("到达村庄需要物资箱数："+resources_begin[0]/water[0]+" "+resources_begin[1]/food[0]);
//
//        water_tony[go_day-1]=water_remain;
//        food_tony[go_day-1]=food_remain;
//
//        money_tony[go_day-1]=money_tony[go_day-1]-resources_begin[0]/water[0]*water[1]*2-resources_begin[1]/food[0]*food[1]*2;
//
//        /**挖矿需要满资源分配**/
//        int[] resources_mine = {0,0};
//        int[] resources_mine_before = {0,0};
//        int[] mine_village_first_resources = {0,0};
//        int[] mine_village_first_resources_before = {0,0};
//
//        /**预测天数**/
//        int go_day_predict=0;
//
//        /**先到达矿洞**/
//        int village_mine_first_day=go_day+2; /**最短路需要为2**/
//        for (;go_day<village_mine_first_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine[0]+=sun[0]*2*water[0];
//                resources_mine[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine[0]+=hot[0]*2*water[0];
//                resources_mine[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine[0]+=sand[0]*water[0];
//                resources_mine[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                village_mine_first_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        /**确定安全情况下的最大挖矿时间**/
//        while (resources_mine[0]+resources_mine[1]+mine_village_first_resources[0]+mine_village_first_resources[1]<=heavy){
//            /**挖矿**/
//            if (weather[go_day]==1){
//                resources_mine[0]+=sun[0]*3*water[0];
//                resources_mine[1]+=sun[1]*3*food[0];
//            } else if (weather[go_day]==2){
//                resources_mine[0]+=hot[0]*3*water[0];
//                resources_mine[1]+=hot[1]*3*food[0];
//            } else if (weather[go_day]==3){
//                resources_mine[0]+=sand[0]*3*water[0];
//                resources_mine[1]+=sand[1]*3*food[0];
//            }
//
//            /**回村**/
//            /**初始化离开矿洞回村需要资源**/
//            mine_village_first_resources[0]=0;
//            mine_village_first_resources[1]=0;
//
//            go_day_predict=go_day+1;
//            int mine_village_first_day = go_day_predict+2; /**最短路需要为2**/
//            for (;go_day_predict<mine_village_first_day;go_day_predict++) {
//                if (weather[go_day_predict] == 1) {
//                    mine_village_first_resources[0] += sun[0]*2*water[0];
//                    mine_village_first_resources[1] += sun[1]*2*food[0];
//                } else if (weather[go_day_predict] == 2) {
//                    mine_village_first_resources[0] += hot[0]*2*water[0];
//                    mine_village_first_resources[1] += hot[1]*2*food[0];
//                } else if (weather[go_day_predict] == 3) {
//                    mine_village_first_resources[0] += sand[0]*water[0];
//                    mine_village_first_resources[1] += sand[1]*food[0];
//                    mine_village_first_day++;
//                }
//            }
//
//            /**前一天数据储存**/
//            if (resources_mine[0]+resources_mine[1]+mine_village_first_resources[0]+mine_village_first_resources[1]<=heavy){
//                resources_mine_before[0]=resources_mine[0];
//                resources_mine_before[1]=resources_mine[1];
//                mine_village_first_resources_before[0]=mine_village_first_resources[0];
//                mine_village_first_resources_before[1]=mine_village_first_resources[1];
//                if (weather[go_day]==1){
//                    water_tony[go_day]=water_tony[go_day-1]-sun[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-sun[1]*3;
//                } else if (weather[go_day]==2){
//                    water_tony[go_day]=water_tony[go_day-1]-hot[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-hot[1]*3;
//                } else if (weather[go_day]==3){
//                    water_tony[go_day]=water_tony[go_day-1]-sand[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-sand[1]*3;
//                }
//                money_tony[go_day]=money_tony[go_day-1]+earn;
//                go_day_predict=go_day+1;
//                mine_village_first_day = go_day_predict+2; /**最短路需要为2**/
//                for (;go_day_predict<mine_village_first_day;go_day_predict++) {
//                    if (weather[go_day_predict] == 1) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-sun[0]*2;
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-sun[1]*2;
//                    } else if (weather[go_day_predict] == 2) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-hot[0]*2;
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-hot[1]*2;
//                    } else if (weather[go_day_predict] == 3) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-sand[0];
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-sand[1];
//                        mine_village_first_day++;
//                    }
//                    money_tony[go_day_predict]=money_tony[go_day_predict-1];
//                }
//                go_day++;
//            }
//        }
//        System.out.println("挖矿最后一天时间："+(go_day-1));
//        System.out.println("回到村庄天数："+(go_day_predict-2));
//        System.out.println("水和食物分配："+(resources_mine_before[0]+mine_village_first_resources_before[0])+" "+(resources_mine_before[1]+mine_village_first_resources_before[1]));
//        System.out.println("水和食物分配（箱数）："+(resources_mine_before[0]+mine_village_first_resources_before[0])/water[0]+" "+(resources_mine_before[1]+mine_village_first_resources_before[1])/food[0]);
//
////        for (int i=0;i<30;i++){
////            System.out.print(water_tony[i]+" ");
////        }
//
//        /**此刻如果回村庄补给后再去挖矿**/
//        go_day = go_day_predict-1;
//        int[] resources_mine__two = {0,0};
//
//        water_tony[go_day-1]=136;
//        food_tony[go_day-1]=142;
//
//        money_tony[go_day-1]=money_tony[go_day-1]-136*water[1]*2-142*food[1]*2;
//
//        /**Matlab计算村庄回终点的最短路为3**/
//        /**Matlab计算矿洞回村庄的最短路为2**/
//        /**Matlab计算矿洞回终点的最短路为5**/
//        /**故我们可以挖矿的时间为截止到25天**/
//
//        /**第二次去矿洞**/
//        int village_mine_second_day=go_day+2;
//        for (;go_day<village_mine_second_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*2*water[0];
//                resources_mine__two[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*2*water[0];
//                resources_mine__two[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*water[0];
//                resources_mine__two[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                village_mine_second_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        /**开始第二次挖矿**/
//        for (;go_day<=day-5;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*3*water[0];
//                resources_mine__two[1]+=sun[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*3;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*3*water[0];
//                resources_mine__two[1]+=hot[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*3;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*3*water[0];
//                resources_mine__two[1]+=sand[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-sand[1]*3;
//            }
//            money_tony[go_day]=money_tony[go_day-1]+earn;
//        }
//
//        /**矿洞回村庄**/
//        int mine_village_second_day=go_day+2;
//        for (;go_day<mine_village_second_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*2*water[0];
//                resources_mine__two[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*2*water[0];
//                resources_mine__two[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*water[0];
//                resources_mine__two[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                mine_village_second_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        System.out.println("第二次挖矿水和食物的分配："+resources_mine__two[0]+" "+resources_mine__two[1]);
//        System.out.println("第二次挖矿水和食物分配（箱数）："+resources_mine__two[0]/water[0]+" "+resources_mine__two[1]/food[0]);
//
//        water_tony[go_day-1]= 42;
//        food_tony[go_day-1]= 38;
//
//        money_tony[go_day-1]=money_tony[go_day-1]-42*water[1]*2-38*food[1]*2;
//
//        /**村庄回终点**/
//        int[] village_end_resources = {0,0};
//        for (;go_day<=day;go_day++){
//            if (weather[go_day]==1){
//                village_end_resources[0]+=sun[0]*2*water[0];
//                village_end_resources[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                village_end_resources[0]+=hot[0]*2*water[0];
//                village_end_resources[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                village_end_resources[0]+=sand[0]*water[0];
//                village_end_resources[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//        System.out.println("村庄回终点需要的水和食物的分配："+village_end_resources[0]+" "+village_end_resources[1]);
//        System.out.println("村庄回终点需要的水和食物分配（箱数）："+village_end_resources[0]/water[0]+" "+village_end_resources[1]/food[0]);
//        System.out.print("每天剩余水的量：");
//        for (int i=0;i<=30;i++) {
//            System.out.print(water_tony[i]+" ");
//        }
//        System.out.println("");
//        System.out.print("每天剩余食物的量：");
//        for (int i=0;i<=30;i++) {
//            System.out.print(food_tony[i]+" ");
//        }
//        System.out.println("");
//        System.out.print("每天剩余钱的量：");
//        for (int i=0;i<=30;i++){
//            System.out.print(money_tony[i]+" ");
//        }
//    }
//}

/**2020年全国大学生数学建模竞赛B题第二题**/
//public class Math_model {
//    public static void main(String[] args) {
//        int heavy = 1200;  /**负重上线1200kg**/
//        int day = 30; /**时间30天**/
//        int money = 10000; /**初始资金10000元**/
//        int earn = 1000; /**基础收益1000元**/
//        int[] water = {3,5}; /**水每箱质量3kg、每箱基准价格5元**/
//        int[] food = {2,10}; /**食物每箱质量2kg、每箱基准价格10元**/
//        int[] sun = {5,7}; /**晴天水消耗5箱，食物消耗7箱**/
//        int[] hot = {8,6}; /**高温水消耗8箱，食物消耗6箱**/
//        int[] sand = {10,10}; /**沙暴水消耗10箱，食物消耗10箱**/
//        int[] weather = {0,2,2,1,3,1,2,3,1,2,2,3,2,1,2,2,2,3,3,2,2,1,1,2,1,3,2,1,1,2,2};
//        /**天气情况：1代表晴朗、2代表高温、3代表沙暴**/
//        /**路线思路：尽可能多的在矿洞里面呆，尽可能进入矿洞的次数最少。**/
//        /**为达到目标，在进矿洞之前物资补给充分，出矿洞后物资保留能去到村庄即可**/
//
//        int[] resources_begin = {0,0};  /**从开始到第一个村庄的资源收集**/
//        int go_day = 1; /**从第一天开始**/
//        int[] money_tony=new int[31];   /**记录每天钱、水、食物剩余**/
//        int[] water_tony=new int[31];
//        int[] food_tony=new int[31];
//        int money_remain=money-(246*5+228*10);  /**根据后面资源计算设定初始资源最优购买**/
//        int water_remain=246;
//        int food_remain=228;
//        money_tony[0]=money_remain; /**设置起点物资携带**/
//        water_tony[0]=water_remain;
//        food_tony[0]=food_remain;
//        System.out.println("开始剩余资金："+money_remain);
//        System.out.println("开始剩余水量："+water_remain+" "+ "开始剩余食物量："+food_remain);
//
//        /**前往最近的村庄**/
//        /**通过最短路可知，前往最短路中的最短路的村庄是村庄1**/
//        int begin_village = 8; /**在Matlab算的最短路为8**/
//        /**for的if、else if三件套为对天气的分类讨论**/
//        for (;go_day<=begin_village;go_day++) {
//            if (weather[go_day] == 1) {
//                resources_begin[0] += sun[0]*2*water[0];    /**资源预计消耗计算（重量）**/
//                resources_begin[1] += sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;   /**物资剩余记录（箱数）**/
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day] == 2) {
//                resources_begin[0] += hot[0]*2*water[0];
//                resources_begin[1] += hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day] == 3) {
//                resources_begin[0] += sand[0]*water[0];
//                resources_begin[1] += sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                begin_village++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        } /**算的在第10天到村庄，根据沙暴停一天原理，同样也要10天，说明计算正确**/
//        /**for循环后、go_day为下一天——11天，故算到达村庄的天数为go_day-1**/
//        System.out.println("到达村庄的天数："+(go_day-1));
//        System.out.println("到达村庄需要物资："+resources_begin[0]+" "+resources_begin[1]);
//        System.out.println("到达村庄需要物资箱数："+resources_begin[0]/water[0]+" "+resources_begin[1]/food[0]);
//
//        /**因为到达当天即可购买物资，所以第10天物资剩余记录会直接更新**/
//        water_tony[go_day-1]=water_remain;
//        food_tony[go_day-1]=food_remain;
//        money_tony[go_day-1]=money_tony[go_day-1]-resources_begin[0]/water[0]*water[1]*2-resources_begin[1]/food[0]*food[1]*2;
//
//        /**此处由两个选择，1：选择最近的挖矿点，路程消耗少，可以有更多资源以及时间放在挖矿上**/
//        /**2：选择较远挖矿点，路程消耗较大，但是对于最终操作离终点近了一步**/
//        /**根据后期时间对比，可以发现我们存在两个进矿操作，故第一次选择较近的矿洞为最优解**/
//        /**可以在第二次进洞时分类讨论**/
//
//        /**挖矿需要满资源分配**/
//        int[] resources_mine = {0,0};   /**挖矿资源记录**/
//        int[] resources_mine_before = {0,0};    /**前一天挖矿资源记录**/
//        int[] mine_village_first_resources = {0,0}; /**预计回村需要资源记录**/
//        int[] mine_village_first_resources_before = {0,0};  /**预计前一天回村需要资源记录**/
//        int go_day_predict=0;   /**预测天数**/
//        /**先到达矿洞**/
//        int village_mine_first_day=go_day+1; /**最短路需要为1**/
//        for (;go_day<village_mine_first_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine[0]+=sun[0]*2*water[0];   /**到达矿洞资源记录**/
//                resources_mine[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;   /**到达矿洞剩余物资记录**/
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine[0]+=hot[0]*2*water[0];
//                resources_mine[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine[0]+=sand[0]*water[0];
//                resources_mine[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                village_mine_first_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        System.out.println("进矿时间："+(go_day-1));
//
//        /**确定安全情况下的最大挖矿时间**/
//        while (resources_mine[0]+resources_mine[1]+mine_village_first_resources[0]+mine_village_first_resources[1]<=heavy){
//            /**挖矿**/
//            if (weather[go_day]==1){
//                resources_mine[0]+=sun[0]*3*water[0];   /**挖矿资源记录**/
//                resources_mine[1]+=sun[1]*3*food[0];
//            } else if (weather[go_day]==2){
//                resources_mine[0]+=hot[0]*3*water[0];
//                resources_mine[1]+=hot[1]*3*food[0];
//            } else if (weather[go_day]==3){
//                resources_mine[0]+=sand[0]*3*water[0];
//                resources_mine[1]+=sand[1]*3*food[0];
//            }
//
//            /**回村**/
//            /**初始化离开矿洞回村需要资源**/
//            mine_village_first_resources[0]=0;
//            mine_village_first_resources[1]=0;
//
//            go_day_predict=go_day+1;    /**预计下一天回村**/
//            int mine_village_first_day = go_day_predict+1; /**最短路需要为1**/
//            for (;go_day_predict<mine_village_first_day;go_day_predict++) {
//                if (weather[go_day_predict] == 1) {
//                    mine_village_first_resources[0] += sun[0]*2*water[0];   /**回村资源记录**/
//                    mine_village_first_resources[1] += sun[1]*2*food[0];
//                } else if (weather[go_day_predict] == 2) {
//                    mine_village_first_resources[0] += hot[0]*2*water[0];
//                    mine_village_first_resources[1] += hot[1]*2*food[0];
//                } else if (weather[go_day_predict] == 3) {
//                    mine_village_first_resources[0] += sand[0]*water[0];
//                    mine_village_first_resources[1] += sand[1]*food[0];
//                    mine_village_first_day++;
//                }
//            }
//            /**前一天数据储存**/
//            if (resources_mine[0]+resources_mine[1]+mine_village_first_resources[0]+mine_village_first_resources[1]<=heavy){
//                /**如果没超载，则储存更新去矿+挖矿总资源记录、回村总资源记录**/
//                resources_mine_before[0]=resources_mine[0];
//                resources_mine_before[1]=resources_mine[1];
//                mine_village_first_resources_before[0]=mine_village_first_resources[0];
//                mine_village_first_resources_before[1]=mine_village_first_resources[1];
//                /**在负重范围内，同时记录更新剩余物资数**/
//                if (weather[go_day]==1){
//                    water_tony[go_day]=water_tony[go_day-1]-sun[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-sun[1]*3;
//                } else if (weather[go_day]==2){
//                    water_tony[go_day]=water_tony[go_day-1]-hot[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-hot[1]*3;
//                } else if (weather[go_day]==3){
//                    water_tony[go_day]=water_tony[go_day-1]-sand[0]*3;
//                    food_tony[go_day]=food_tony[go_day-1]-sand[1]*3;
//                }
//                money_tony[go_day]=money_tony[go_day-1]+earn;
//                /**预测下一天回村，储存更新回村时间剩余物资数**/
//                go_day_predict=go_day+1;
//                mine_village_first_day = go_day_predict+1; /**最短路需要为1**/
//                for (;go_day_predict<mine_village_first_day;go_day_predict++) {
//                    if (weather[go_day_predict] == 1) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-sun[0]*2;
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-sun[1]*2;
//                    } else if (weather[go_day_predict] == 2) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-hot[0]*2;
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-hot[1]*2;
//                    } else if (weather[go_day_predict] == 3) {
//                        water_tony[go_day_predict]=water_tony[go_day_predict-1]-sand[0];
//                        food_tony[go_day_predict]=food_tony[go_day_predict-1]-sand[1];
//                        mine_village_first_day++;
//                    }
//                    money_tony[go_day_predict]=money_tony[go_day_predict-1];
//                }
//                /**若负重达标，则go_day+1，最终go_day为离开矿洞的时间**/
//                go_day++;
//            }
//
//        }
//        System.out.println("挖矿最后一天时间："+(go_day-1));
//        /**go_day_predict-2的原因：内部最后一次判断后，while循环仍旧进行中，所以go_day_predict会多+1，加上内部判断的多+1，总过多+2**/
//        System.out.println("回到村庄天数："+(go_day_predict-2));
//        System.out.println("起点应该携带水和食物分配："+(resources_mine_before[0]+mine_village_first_resources_before[0])+" "+(resources_mine_before[1]+mine_village_first_resources_before[1]));
//        System.out.println("起点应该携带水和食物分配（箱数）："+(resources_mine_before[0]+mine_village_first_resources_before[0])/water[0]+" "+(resources_mine_before[1]+mine_village_first_resources_before[1])/food[0]);
//
//        /**此刻如果回村庄补给后再去挖矿**/
//        go_day = go_day_predict-1;  /**回村的下一天**/
//        int[] resources_mine__two = {0,0};
//
//        /**在村庄的最后一天物资更新**/
//        water_tony[go_day-1]=95;  /**方案2：142**/ /**方案1：95**/
//        food_tony[go_day-1]=95;  /**方案2：140**/ /**方案1：95**/
//        money_tony[go_day-1]=money_tony[go_day-1]-142*water[1]*2-140*food[1]*2;
//
//        /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//        /**！铭记：！**/
//        /**运行下面方案时，请注释其中一个方案，以防止命名重复**/
//
//        /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//
//        /**方案1：**/
//        /**Matlab计算村庄1回终点的最短路为3**/
//        /**Matlab计算矿洞1回村庄的最短路为1**/
//        /**Matlab计算矿洞回终点的最短路为4**/
//        /**故我们可以挖矿的时间为截止到26天**/
//
//        /**第二次去矿洞**/
//        int village_mine_second_day=go_day+1;
//        for (;go_day<village_mine_second_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*2*water[0];
//                resources_mine__two[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*2*water[0];
//                resources_mine__two[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*water[0];
//                resources_mine__two[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                village_mine_second_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        /**开始第二次挖矿**/
//        for (;go_day<=day-4;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*3*water[0];
//                resources_mine__two[1]+=sun[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*3;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*3*water[0];
//                resources_mine__two[1]+=hot[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*3;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*3*water[0];
//                resources_mine__two[1]+=sand[1]*3*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0]*3;
//                food_tony[go_day]=food_tony[go_day-1]-sand[1]*3;
//            }
//            money_tony[go_day]=money_tony[go_day-1]+earn;
//        }
//
//        /**矿洞回村庄**/
//        int mine_village_second_day=go_day+1;
//        for (;go_day<mine_village_second_day;go_day++){
//            if (weather[go_day]==1){
//                resources_mine__two[0]+=sun[0]*2*water[0];
//                resources_mine__two[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                resources_mine__two[0]+=hot[0]*2*water[0];
//                resources_mine__two[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                resources_mine__two[0]+=sand[0]*water[0];
//                resources_mine__two[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//                mine_village_second_day++;
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//
//        System.out.println("第二次挖矿水和食物的分配："+resources_mine__two[0]+" "+resources_mine__two[1]);
//        System.out.println("第二次挖矿水和食物分配（箱数）："+resources_mine__two[0]/water[0]+" "+resources_mine__two[1]/food[0]);
//
//        water_tony[go_day-1]= 42;
//        food_tony[go_day-1]= 38;
//
//        money_tony[go_day-1]=money_tony[go_day-1]-42*water[1]*2-38*food[1]*2;
//
//        /**村庄回终点**/
//        int[] village_end_resources = {0,0};
//        for (;go_day<=day;go_day++){
//            if (weather[go_day]==1){
//                village_end_resources[0]+=sun[0]*2*water[0];
//                village_end_resources[1]+=sun[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
//            } else if (weather[go_day]==2){
//                village_end_resources[0]+=hot[0]*2*water[0];
//                village_end_resources[1]+=hot[1]*2*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
//                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
//            } else if (weather[go_day]==3){
//                village_end_resources[0]+=sand[0]*water[0];
//                village_end_resources[1]+=sand[1]*food[0];
//                water_tony[go_day]=water_tony[go_day-1]-sand[0];
//                food_tony[go_day]=food_tony[go_day-1]-sand[1];
//            }
//            money_tony[go_day]=money_tony[go_day-1];
//        }
//        System.out.println("村庄回终点需要的水和食物的分配："+village_end_resources[0]+" "+village_end_resources[1]);
//        System.out.println("村庄回终点需要的水和食物分配（箱数）："+village_end_resources[0]/water[0]+" "+village_end_resources[1]/food[0]);
//        System.out.print("每天剩余水的量：");
//        for (int i=0;i<=30;i++) {
//            System.out.print(water_tony[i]+" ");
//        }
//        System.out.println("");
//        System.out.print("每天剩余食物的量：");
//        for (int i=0;i<=30;i++) {
//            System.out.print(food_tony[i]+" ");
//        }
//        System.out.println("");
//        System.out.print("每天剩余钱的量：");
//        for (int i=0;i<=30;i++){
//            System.out.print(money_tony[i]+" ");
//        }
//
//        /**方案2：**/
//        /**Matlab计算村庄2回终点的最短路为2**/
//        /**Matlab计算矿洞2回村庄的最短路为1**/
//        /**Matlab计算矿洞回终点的最短路为2**/
//        /**故我们可以挖矿的时间为截止到28天**/
//        /**前提要求，物资足够持续挖矿并且能回到终点**/
//
////        /**第二次去矿洞**/
////        int village_mine_second_day=go_day+2;
////        for (;go_day<village_mine_second_day;go_day++){
////            if (weather[go_day]==1){
////                resources_mine__two[0]+=sun[0]*2*water[0];
////                resources_mine__two[1]+=sun[1]*2*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
////                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
////            } else if (weather[go_day]==2){
////                resources_mine__two[0]+=hot[0]*2*water[0];
////                resources_mine__two[1]+=hot[1]*2*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
////                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
////            } else if (weather[go_day]==3){
////                resources_mine__two[0]+=sand[0]*water[0];
////                resources_mine__two[1]+=sand[1]*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sand[0];
////                food_tony[go_day]=food_tony[go_day-1]-sand[1];
////                village_mine_second_day++;
////            }
////            money_tony[go_day]=money_tony[go_day-1];
////        }
////
////        /**开始第二次挖矿**/
////        for (;go_day<=day-2;go_day++){
////            if (weather[go_day]==1){
////                resources_mine__two[0]+=sun[0]*3*water[0];
////                resources_mine__two[1]+=sun[1]*3*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sun[0]*3;
////                food_tony[go_day]=food_tony[go_day-1]-sun[1]*3;
////            } else if (weather[go_day]==2){
////                resources_mine__two[0]+=hot[0]*3*water[0];
////                resources_mine__two[1]+=hot[1]*3*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-hot[0]*3;
////                food_tony[go_day]=food_tony[go_day-1]-hot[1]*3;
////            } else if (weather[go_day]==3){
////                resources_mine__two[0]+=sand[0]*3*water[0];
////                resources_mine__two[1]+=sand[1]*3*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sand[0]*3;
////                food_tony[go_day]=food_tony[go_day-1]-sand[1]*3;
////            }
////            money_tony[go_day]=money_tony[go_day-1]+earn;
////        }
////
////        /**矿洞直接回终点**/
////        for (;go_day<=day;go_day++){
////            if (weather[go_day]==1){
////                resources_mine__two[0]+=sun[0]*2*water[0];
////                resources_mine__two[1]+=sun[1]*2*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sun[0]*2;
////                food_tony[go_day]=food_tony[go_day-1]-sun[1]*2;
////            } else if (weather[go_day]==2){
////                resources_mine__two[0]+=hot[0]*2*water[0];
////                resources_mine__two[1]+=hot[1]*2*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-hot[0]*2;
////                food_tony[go_day]=food_tony[go_day-1]-hot[1]*2;
////            } else if (weather[go_day]==3){
////                resources_mine__two[0]+=sand[0]*water[0];
////                resources_mine__two[1]+=sand[1]*food[0];
////                water_tony[go_day]=water_tony[go_day-1]-sand[0];
////                food_tony[go_day]=food_tony[go_day-1]-sand[1];
////            }
////            money_tony[go_day]=money_tony[go_day-1];
////        }
////
////        System.out.println("第二次挖矿水和食物的分配："+resources_mine__two[0]+" "+resources_mine__two[1]);
////        System.out.println("第二次挖矿水和食物分配（箱数）："+resources_mine__two[0]/water[0]+" "+resources_mine__two[1]/food[0]);
////        System.out.print("每天剩余水的量：");
////        for (int i=0;i<=30;i++) {
////            System.out.print(water_tony[i]+" ");
////        }
////        System.out.println("");
////        System.out.print("每天剩余食物的量：");
////        for (int i=0;i<=30;i++) {
////            System.out.print(food_tony[i]+" ");
////        }
////        System.out.println("");
////        System.out.print("每天剩余钱的量：");
////        for (int i=0;i<=30;i++){
////            System.out.print(money_tony[i]+" ");
////        }
//
//    }
//}

/**2020年全国大学生数学建模竞赛B题第三题**/
//public class Math_model {
//    public static void main(String[] args) {
//        /**天气分布判断**/
//        int[] weather1={2,2,1,3,1,2,3,1,2,2,3,2,1,2,2,2,3,3,2,2,1,1,2,1,3,2,1,1,2,2};
//        int sun_num=0;
//        int hot_num=0;
//        int sand_num=0;
//        for (int i=0;i<30;i++){
//            if (weather1[i]==1)
//                sun_num+=1;
//            if (weather1[i]==2)
//                hot_num+=1;
//            if (weather1[i]==3)
//                sand_num+=1;
//        }
//
//        int heavy = 1200;
//        int day = 10;
//        int money = 10000;
//        int earn = 200;
//        int[] water = {3,5};
//        int[] food = {2,10};
//        int[] sun = {3,4};
//        int[] hot = {9,9};
//        int[] sand = {10,10};
//        int money_record_one[] = new int[100];
//        int resources_record_one[][] = new int[2][100];
//
//        int money_record_two[] = new int[100];
//        int resources_record_two[][] = new int[2][100];
//
//        int money_record_three[] = new int[100];
//        int resources_record_three[][] = new int[2][100];
//
//        int day_begin_end = 3;
//
//        int day_begin_mine = 3;
//        int day_mine_end = 2;
//        int day_begin_mine_end = day_begin_mine+day_mine_end;
//
//        int[] resources_one = {0,0};
//        int go_day_one = 1;
//        int[] resources_two = {0,0};
//        int go_day_two = 1;
//        int[] resources_three = {0,0};
//        int go_day_three = 1;
//
//        int num_simulate_one = 101;
//        int num_sim_do_one = 1;
//        int num_simulate_two = 101;
//        int num_sim_do_two = 1;
//        int num_simulate_three = 101;
//        int num_sim_do_three = 1;
//
//        /**选择线路1：直接去终点**/
//        for (;num_sim_do_one<num_simulate_one;num_sim_do_one++){
//            go_day_one=1;
//            resources_one[0]=0;
//            resources_one[1]=0;
//            /**参考第一关第二关天气数据，对下一天的天气预测实行加权随机**/
//            for (;go_day_one<=day_begin_end;go_day_one++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_one[0] += sun[0]*2;
//                    resources_one[1] += sun[1]*2;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_one[0] += hot[0]*2;
//                    resources_one[1] += hot[1]*2;
//                }
//            }
//            money_record_one[num_sim_do_one-1] = money-resources_one[0]*water[1]-resources_one[1]*food[1];
//            resources_record_one[0][num_sim_do_one-1] = resources_one[0];
//            resources_record_one[1][num_sim_do_one-1] = resources_one[1];
//            money=10000;
//        }
//
//        /**线路1情况下，高温是否等待**/
//
//        int money_record_one_improve[][] = new int[day-day_begin_end+1][100];
//        int resources_record_one_improve[][][] = new int[day-day_begin_end+1][2][100];
//
//        int num_simulate_one_improve = 101;
//        int[] resources_one_improve = {0,0};
//        int go_day_one_improve = 1;
//
//        int wait_hot_day=0;
//        int wait_hot_cycle=day-day_begin_end;
//        for (;wait_hot_day<=wait_hot_cycle;wait_hot_day++) {
//            int num_sim_do_one_improve = 1;
//            for (; num_sim_do_one_improve < num_simulate_one_improve; num_sim_do_one_improve++) {
//                go_day_one_improve = 1;
//                resources_one_improve[0] = 0;
//                resources_one_improve[1] = 0;
//                int day_begin_end_improve = 3;
//                int wait_hot = 0;
//                /**参考第一关第二关天气数据，对下一天的天气预测实行加权随机**/
//                for (; go_day_one_improve <= day_begin_end_improve; go_day_one_improve++) {
//                    int random_weather = (int) (Math.random() * (sun_num + hot_num) + 1);
//                    if (random_weather >= 1 && random_weather <= sun_num) {
//                        resources_one_improve[0] += sun[0] * 2;
//                        resources_one_improve[1] += sun[1] * 2;
//                    } else if (random_weather >= sun_num + 1 && random_weather <= sun_num + hot_num) {
//                        if (wait_hot<wait_hot_day) {
//                            resources_one_improve[0] += hot[0];
//                            resources_one_improve[1] += hot[1];
//                            day_begin_end_improve++;
//                            wait_hot++;
//                        } else {
//                            resources_one_improve[0] += hot[0] * 2;
//                            resources_one_improve[1] += hot[1] * 2;
//                        }
//                    }
//                }
//                money_record_one_improve[wait_hot_day][num_sim_do_one_improve - 1] = money - resources_one_improve[0] * water[1] - resources_one_improve[1] * food[1];
//                resources_record_one_improve[wait_hot_day][0][num_sim_do_one_improve - 1] = resources_one_improve[0];
//                resources_record_one_improve[wait_hot_day][1][num_sim_do_one_improve - 1] = resources_one_improve[1];
//                money = 10000;
//            }
//        }
//
//        /**选择线路2：去挖矿再去终点**/
//
//        for (;num_sim_do_two<num_simulate_two;num_sim_do_two++) {
//            go_day_two=1;
//            resources_two[0]=0;
//            resources_two[1]=0;
//            /**参考第一关第二关天气数据，对下一天的天气预测实行加权随机**/
//            for (;go_day_two<=day_begin_mine;go_day_two++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_two[0] += sun[0]*2;
//                    resources_two[1] += sun[1]*2;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_two[0] += hot[0]*2;
//                    resources_two[1] += hot[1]*2;
//                }
//            }
//            int day_mineToEnd=go_day_two;
//            /**晴朗挖矿，高温走**/
//            for (;go_day_two<=day_mineToEnd;go_day_two++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (day_mineToEnd==day-day_mine_end){
//                    break;
//                }
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_two[0] += sun[0]*3;
//                    resources_two[1] += sun[1]*3;
//                    money+=earn;
//                    day_mineToEnd++;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    break;
//                }
//            }
//            int go_day_two_end = go_day_two+day_mine_end;
//            for (;go_day_two<go_day_two_end;go_day_two++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_two[0] += sun[0]*2;
//                    resources_two[1] += sun[1]*2;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_two[0] += hot[0]*2;
//                    resources_two[1] += hot[1]*2;
//                }
//            }
//            money_record_two[num_sim_do_two-1] = money-resources_two[0]*water[1]-resources_two[1]*food[1];
//            resources_record_two[0][num_sim_do_two-1] = resources_two[0];
//            resources_record_two[1][num_sim_do_two-1] = resources_two[1];
//            money=10000;
//        }
//
//
//        for (;num_sim_do_three<num_simulate_three;num_sim_do_three++) {
//            go_day_three = 1;
//            resources_three[0] = 0;
//            resources_three[1] = 0;
//
//            /**参考第一关第二关天气数据，对下一天的天气预测实行加权随机**/
//            for (;go_day_three<=day_begin_mine;go_day_three++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_three[0] += sun[0]*2;
//                    resources_three[1] += sun[1]*2;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_three[0] += hot[0]*2;
//                    resources_three[1] += hot[1]*2;
//                }
//            }
//            int day_mineToEnd=go_day_three;
//            /**晴朗挖矿，高温停**/
//            for (;go_day_three<=day_mineToEnd;go_day_three++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (day_mineToEnd==day-day_mine_end){
//                    break;
//                }
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_three[0] += sun[0]*3;
//                    resources_three[1] += sun[1]*3;
//                    money+=earn;
//                    day_mineToEnd++;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_three[0] += hot[0];
//                    resources_three[1] += hot[1];
//                    day_mineToEnd++;
//                }
//            }
//            int go_day_three_end = go_day_three+day_mine_end;
//            for (;go_day_three<go_day_three_end;go_day_three++) {
//                int random_weather = (int) (Math.random() * (sun_num+hot_num) + 1);
//                if (random_weather >= 1 && random_weather <= sun_num) {
//                    resources_three[0] += sun[0]*2;
//                    resources_three[1] += sun[1]*2;
//                } else if (random_weather >= sun_num+1 && random_weather <= sun_num+hot_num) {
//                    resources_three[0] += hot[0]*2;
//                    resources_three[1] += hot[1]*2;
//                }
//            }
//            money_record_three[num_sim_do_three-1] = money-resources_three[0]*water[1]-resources_three[1]*food[1];
//            resources_record_three[0][num_sim_do_three-1] = resources_three[0];
//            resources_record_three[1][num_sim_do_three-1] = resources_three[1];
//            money=10000;
//        }
//
//        /**下面注释为三路线选择对比问题：方案一（直接回终点）；方案二（矿山路且高温不等待）；方案三（矿山路且高温等待）**/
////        System.out.println("");
////        System.out.println("方案一：");
////
////        for (int i=0;i<100;i++){
////            System.out.print(money_record_one[i]+" ");
////        }
////
////        System.out.println("");
////        System.out.println("方案二：");
////
////        for (int i=0;i<100;i++){
////            System.out.print(money_record_two[i]+" ");
////        }
////
////        System.out.println("");
////        System.out.println("方案三：");
////
////        for (int i=0;i<100;i++){
////            System.out.print(money_record_three[i]+" ");
////        }
//
//        /**选择方案一后，模型优化，确认是否需要高温等待**/
//        for (int j=0;j<=wait_hot_cycle;j++) {
//            System.out.println("高温等待天数："+j);
//            for (int i = 0; i < 100; i++) {
//                System.out.print(money_record_one_improve[j][i]+" ");
//            }
//            System.out.println("");
//        }
//
//        /**约束线购买原则**/
//        int num_constraint = 0;
//        int i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (resources_record_one_improve[0][0][j] <= max(resources_record_one_improve[0][0])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("起点买水约束线："+(max(resources_record_one_improve[0][0])-i));
//        num_constraint = 0;
//        i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (resources_record_one_improve[0][1][j] <= max(resources_record_one_improve[0][1])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("起点买食物约束线："+(max(resources_record_one_improve[0][1])-i));
//
//    }
//    public static int max(int[] num1){
//        int max = num1[0];
//        int len = num1.length;
//        for (int i = 1; i < len; i++) {
//            if(max<num1[i]){
//                num1[i] = num1[i] + max;
//                max = num1[i] - max;
//                num1[i] = num1[i] - max;
//            }
//        }
//        return max;
//    }
//    public static int min(int[] num2){
//        int min = num2[0];
//        int len = num2.length;
//        for (int i = 0; i < len; i++) {
//            if(min>num2[i]){
//                int t;
//                t = num2[i];
//                num2[i] = min;
//                min = t;
//            }
//        }
//        return min;
//    }
//}

/**2020年全国大学生数学建模竞赛B题第四题**/
//public class Math_model {
//    public static void main(String[] args) {
//
//        /**大收集装置**/
//
//        int[] go_village_day = new int[100];
//        int[][] go_village_resource = new int[2][100];
//        int[] first_mine_begin = new int[100];
//        int[] first_mine_end = new int[100];
//        int[] first_return_village_day = new int[100];
//        int[][] first_need_resource = new int[2][100];
//        int[] second_mine_begin = new int[100];
//        int[] second_mine_end = new int[100];
//        int[] second_return_villageOrEnd_day = new int[100];
//        int[][] second_need_resource = new int[2][100];
//        int[][] return_end_resource = new int[2][100];
//
//        int[] money_end = new int[100];
//        for (int num_simulation=0;num_simulation<100;num_simulation++) {
//            /**初始变量设定**/
//            int heavy = 1200;
//            int day = 30;
//            int money = 10000;
//            int earn = 1000;
//            int[] water = {3, 5};
//            int[] food = {2, 10};
//            int[] sun = {3, 4};
//            int[] hot = {9, 9};
//            int[] sand = {10, 10};
//
//            /**此处如果依旧是第3问进行概率模拟，可能会出现极端情况**/
//            /**故我此次的天气模拟直接就是呈现6，9，15的随机分布模拟状况**/
//
//            /**天气分布模拟**/
//            int[] weather_reference = {2, 2, 1, 3, 1, 2, 3, 1, 2, 2, 3, 2, 1, 2, 2, 2, 3, 3, 2, 2, 1, 1, 2, 1, 3, 2, 1, 1, 2, 2};
//            int sun_num = 0;
//            int hot_num = 0;
//            int sand_num = 0;
//
//            int[] weather_list = new int[day];
//            int day_list = 0;  /**生成多少个随机数的变量**/
//            int list_count = 0;  /**生成day_list个随机数循环了几次**/
//            while (day_list < day) {
//                int random_num = (int) (Math.random() * day + 1);
//                list_count++;
//                for (int num_cycle = 0; num_cycle < day; num_cycle++) {
//
//                    if (weather_list[num_cycle] == random_num) {
//                        break;
//                    } else if (num_cycle == day_list) {
//                        weather_list[day_list] = random_num;
//                        day_list++;
//                        break;
//                    }
//                }
//            }
//
//            int[] weather_regroup = new int[day + 1];
//            weather_regroup[0] = 0;
//            for (int weather_day = 1; weather_day <= day; weather_day++) {
//                weather_regroup[weather_list[weather_day - 1]] = weather_reference[weather_day - 1];
//            }
//
//            int[] resources_begin = {0, 0};
//            int go_day = 1;
//            int begin_village = 5; /**在最短路Matlab算的为5**/
//            for (; go_day <= begin_village; go_day++) {
//                if (weather_regroup[go_day] == 1) {
//                    resources_begin[0] += sun[0] * 2 * water[0];
//                    resources_begin[1] += sun[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 2) {
//                    resources_begin[0] += hot[0] * 2 * water[0];
//                    resources_begin[1] += hot[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 3) {
//                    resources_begin[0] += sand[0] * water[0];
//                    resources_begin[1] += sand[1] * food[0];
//                    begin_village++;
//                }
//            }
//            go_village_day[num_simulation] = (go_day - 1);
//            go_village_resource[0][num_simulation] = resources_begin[0] / water[0];
//            go_village_resource[1][num_simulation] = resources_begin[1] / food[0];
////            System.out.println("到达村庄的天数：" + (go_day - 1));
////            System.out.println("到达村庄需要物资：" + resources_begin[0] + " " + resources_begin[1]);
//            System.out.println("到达村庄需要物资箱数：" + resources_begin[0] / water[0] + " " + resources_begin[1] / food[0]);
//
//
//            /**挖矿需要满资源分配**/
//            int[] resources_mine = {0, 0};
//            int[] resources_mine_before = {0, 0};
//            int[] mine_village_first_resources = {0, 0};
//            int[] mine_village_first_resources_before = {0, 0};
//
//            /**预测天数**/
//            int go_day_predict = 0;
//
//            /**先到达矿洞**/
//            int village_mine_first_day = go_day + 2; /**最短路需要为2**/
//            for (; go_day < village_mine_first_day; go_day++) {
//                if (weather_regroup[go_day] == 1) {
//                    resources_mine[0] += sun[0] * 2 * water[0];
//                    resources_mine[1] += sun[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 2) {
//                    resources_mine[0] += hot[0] * 2 * water[0];
//                    resources_mine[1] += hot[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 3) {
//                    resources_mine[0] += sand[0] * water[0];
//                    resources_mine[1] += sand[1] * food[0];
//                    village_mine_first_day++;
//                }
//            }
//            first_mine_begin[num_simulation] = (go_day-1);
////            System.out.println("第一次到达矿洞的时间："+(go_day-1));
//
//            /**确定安全情况下的最大挖矿时间**/
//            while (resources_mine[0] + resources_mine[1] + mine_village_first_resources[0] + mine_village_first_resources[1] <= heavy) {
//                /**挖矿**/
//                if (weather_regroup[go_day] == 1) {
//                    resources_mine[0] += sun[0] * 3 * water[0];
//                    resources_mine[1] += sun[1] * 3 * food[0];
//                } else if (weather_regroup[go_day] == 2) {
//                    resources_mine[0] += hot[0] * 3 * water[0];
//                    resources_mine[1] += hot[1] * 3 * food[0];
//                } else if (weather_regroup[go_day] == 3) {
//                    resources_mine[0] += sand[0] * 3 * water[0];
//                    resources_mine[1] += sand[1] * 3 * food[0];
//                }
//
//                /**回村**/
//                /**初始化离开矿洞回村需要资源**/
//                mine_village_first_resources[0] = 0;
//                mine_village_first_resources[1] = 0;
//
//                go_day_predict = go_day + 1;
//                int mine_village_first_day = go_day_predict + 2; /**最短路需要为2**/
//                for (; go_day_predict < mine_village_first_day; go_day_predict++) {
//                    if (weather_regroup[go_day_predict] == 1) {
//                        mine_village_first_resources[0] += sun[0] * 2 * water[0];
//                        mine_village_first_resources[1] += sun[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day_predict] == 2) {
//                        mine_village_first_resources[0] += hot[0] * 2 * water[0];
//                        mine_village_first_resources[1] += hot[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day_predict] == 3) {
//                        mine_village_first_resources[0] += sand[0] * water[0];
//                        mine_village_first_resources[1] += sand[1] * food[0];
//                        mine_village_first_day++;
//                    }
//                }
//
//                /**前一天数据储存**/
//                if (resources_mine[0] + resources_mine[1] + mine_village_first_resources[0] + mine_village_first_resources[1] <= heavy) {
//                    resources_mine_before[0] = resources_mine[0];
//                    resources_mine_before[1] = resources_mine[1];
//                    mine_village_first_resources_before[0] = mine_village_first_resources[0];
//                    mine_village_first_resources_before[1] = mine_village_first_resources[1];
//                    go_day++;
//                }
//            }
//            first_mine_end[num_simulation] = (go_day - 1);
//            first_return_village_day[num_simulation] = (go_day_predict - 2);
//            first_need_resource[0][num_simulation] = (resources_mine_before[0] + mine_village_first_resources_before[0]) / water[0];
//            first_need_resource[1][num_simulation] = (resources_mine_before[1] + mine_village_first_resources_before[1]) / food[0];
////            System.out.println("挖矿最后一天时间：" + (go_day - 1));
////            System.out.println("回到村庄天数：" + (go_day_predict - 2));
////            System.out.println("起点应该携带水和食物分配：" + (resources_mine_before[0] + mine_village_first_resources_before[0]) + " " + (resources_mine_before[1] + mine_village_first_resources_before[1]));
////            System.out.println("起点应该携带水和食物分配（箱数）：" + (resources_mine_before[0] + mine_village_first_resources_before[0]) / water[0] + " " + (resources_mine_before[1] + mine_village_first_resources_before[1]) / food[0]);
//
//            /**此刻如果回村庄补给后再去挖矿**/
//            go_day = go_day_predict - 1;
//
//            int[] resources_mine_two = {0, 0};
//            int[] mine_village_second_resources = {0, 0};
//
//            int[] resources_mine_two_before = {0, 0};
//            int[] mine_village_second_resources_before = {0, 0};
//
//
//            int go_day_predict_second = 0;
//
//            /**第二次去矿洞**/
//            int village_mine_second_day = go_day + 2;
//            for (; go_day < village_mine_second_day; go_day++) {
//                if (weather_regroup[go_day] == 1) {
//                    resources_mine_two[0] += sun[0] * 2 * water[0];
//                    resources_mine_two[1] += sun[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 2) {
//                    resources_mine_two[0] += hot[0] * 2 * water[0];
//                    resources_mine_two[1] += hot[1] * 2 * food[0];
//                } else if (weather_regroup[go_day] == 3) {
//                    resources_mine_two[0] += sand[0] * water[0];
//                    resources_mine_two[1] += sand[1] * food[0];
//                    village_mine_second_day++;
//                }
//            }
//            second_mine_begin[num_simulation] = (go_day-1);
////            System.out.println("第二次到达矿洞的时间："+(go_day-1));
//
//            /**开始第二次挖矿**/
//            /**确定安全情况下的最大挖矿时间**/
//            while (resources_mine_two[0] + resources_mine_two[1] + mine_village_second_resources[0] + mine_village_second_resources[1] <= heavy && (go_day_predict_second - 1) <= day) {
//                /**第二次挖矿**/
//                if (weather_regroup[go_day] == 1) {
//                    resources_mine_two[0] += sun[0] * 3 * water[0];
//                    resources_mine_two[1] += sun[1] * 3 * food[0];
//                } else if (weather_regroup[go_day] == 2) {
//                    resources_mine_two[0] += hot[0] * 3 * water[0];
//                    resources_mine_two[1] += hot[1] * 3 * food[0];
//                } else if (weather_regroup[go_day] == 3) {
//                    resources_mine_two[0] += sand[0] * 3 * water[0];
//                    resources_mine_two[1] += sand[1] * 3 * food[0];
//                }
//
//                /**初始化离开矿洞需要资源**/
//                mine_village_second_resources[0] = 0;
//                mine_village_second_resources[1] = 0;
//
//                /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//                /**！铭记：！**/
//                /**使用下面代码时，需要注销其中一种情况**/
//
//                /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//                /**回村情况**/
//                /**注意295行也需要注释**/
//
////                go_day_predict_second=go_day+1;
////                int mine_village_second_day = go_day_predict_second+2; /**最短路需要为2**/
////                for (;go_day_predict_second<mine_village_second_day;go_day_predict_second++) {
////                    if (weather_regroup[go_day_predict_second] == 1) {
////                        mine_village_second_resources[0] += sun[0] * 2 * water[0];
////                        mine_village_second_resources[1] += sun[1] * 2 * food[0];
////                    } else if (weather_regroup[go_day_predict_second] == 2) {
////                        mine_village_second_resources[0] += hot[0] * 2 * water[0];
////                        mine_village_second_resources[1] += hot[1] * 2 * food[0];
////                    } else if (weather_regroup[go_day_predict_second] == 3) {
////                        mine_village_second_resources[0] += sand[0] * water[0];
////                        mine_village_second_resources[1] += sand[1] * food[0];
////                        mine_village_second_day++;
////                    }
////                }
////                /**村庄回终点**/
////                int[] village_end_resources = {0, 0};
////                int village_end = go_day_predict_second+3;
////                for (; go_day_predict_second <= village_end; go_day_predict_second++) {
////                    if (go_day_predict_second >= day) {
////                        continue;
////                    } else {
////                        if (weather_regroup[go_day_predict_second] == 1) {
////                            village_end_resources[0] += sun[0] * 2 * water[0];
////                            village_end_resources[1] += sun[1] * 2 * food[0];
////                        } else if (weather_regroup[go_day_predict_second] == 2) {
////                            village_end_resources[0] += hot[0] * 2 * water[0];
////                            village_end_resources[1] += hot[1] * 2 * food[0];
////                        } else if (weather_regroup[go_day_predict_second] == 3) {
////                            village_end_resources[0] += sand[0] * water[0];
////                            village_end_resources[1] += sand[1] * food[0];
////                            village_end++;
////                        }
////                    }
////                }
////            System.out.println("村庄回终点需要的水和食物的分配：" + village_end_resources[0] + " " + village_end_resources[1]);
////            System.out.println("村庄回终点需要的水和食物分配（箱数）：" + village_end_resources[0] / water[0] + " " + village_end_resources[1] / food[0]);
//
//                /**回终点情况**/
//
//                go_day_predict_second = go_day + 1;
//                int mine_village_second_day = go_day_predict_second + 3; /**最短路需要为3**/
//                for (; go_day_predict_second < mine_village_second_day; go_day_predict_second++) {
//                    if (go_day_predict_second >= day) {
//                        continue;
//                    } else {
//                        if (weather_regroup[go_day_predict_second] == 1) {
//                            mine_village_second_resources[0] += sun[0] * 2 * water[0];
//                            mine_village_second_resources[1] += sun[1] * 2 * food[0];
//                        } else if (weather_regroup[go_day_predict_second] == 2) {
//                            mine_village_second_resources[0] += hot[0] * 2 * water[0];
//                            mine_village_second_resources[1] += hot[1] * 2 * food[0];
//                        } else if (weather_regroup[go_day_predict_second] == 3) {
//                            mine_village_second_resources[0] += sand[0] * water[0];
//                            mine_village_second_resources[1] += sand[1] * food[0];
//                            mine_village_second_day++;
//                        }
//                    }
//                }
//
//
//                /**前一天数据储存**/
//                if (resources_mine_two[0] + resources_mine_two[1] + mine_village_second_resources[0] + mine_village_second_resources[1] <= heavy && (go_day_predict_second - 1) <= day) {
//                    resources_mine_two_before[0] = resources_mine_two[0];
//                    resources_mine_two_before[1] = resources_mine_two[1];
//                    mine_village_second_resources_before[0] = mine_village_second_resources[0];
//                    mine_village_second_resources_before[1] = mine_village_second_resources[1];
//
//                    /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//                    /**注释村庄情况请同时注释这两行**/
//
//                    /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
////                    return_end_resource[0][num_simulation] = village_end_resources[0] / water[0];
////                    return_end_resource[1][num_simulation] = village_end_resources[1] / food[0];
//                }
//                go_day++;
//            }
//
//            second_mine_end[num_simulation] = (go_day - 1);
//            second_return_villageOrEnd_day[num_simulation] = (go_day_predict_second - 2);
//            second_need_resource[0][num_simulation] = resources_mine_two[0] / water[0];
//            second_need_resource[1][num_simulation] = resources_mine_two[1] / food[0];
////            System.out.println("挖矿最后一天时间：" + (go_day - 1));
//            System.out.println("回到村庄/终点的天数：" + (go_day_predict_second - 2));
////            System.out.println("第二次挖矿水和食物的分配：" + resources_mine_two_before[0] + " " + resources_mine_two_before[1]);
////            System.out.println("第二次挖矿水和食物分配（箱数）：" + resources_mine_two_before[0] / water[0] + " " + resources_mine_two_before[1] / food[0]);
//
//
//        }
//
//        /**使用下面代码需要注释其中一种情况**/
//
//        /**直接去终点**/
//        for (int i=0;i<100;i++){
//            money_end[i] = 10000 + (first_mine_end[i]-first_mine_begin[i]+second_mine_end[i]-second_mine_begin[i])*1000-
//                    go_village_resource[0][i]*5*2-go_village_resource[1][i]*10*2-
//                    first_need_resource[0][i]*5-first_need_resource[1][i]*10-
//                    second_need_resource[0][i]*5*2-second_need_resource[1][i]*10*2;
//        }
//        /**常规回村庄**/
////        for (int i=0;i<100;i++){
////            money_end[i] = 10000 + (first_mine_end[i]-first_mine_begin[i]+second_mine_end[i]-second_mine_begin[i])*1000-
////                    go_village_resource[0][i]*5*2-go_village_resource[1][i]*10*2-
////                    first_need_resource[0][i]*5-first_need_resource[1][i]*10-
////                    second_need_resource[0][i]*5*2-second_need_resource[1][i]*10*2-
////                    return_end_resource[0][i]*5*2-return_end_resource[1][i]*10*2;
////        }
//
//        System.out.println("最终剩余资金分布：");
//        System.out.print("资金：");
//        for (int j=0;j<100;j++) {
//            System.out.print(money_end[j]+" ");
//        }
//        System.out.println("");
//        System.out.println("起点携带资源分布：");
//        System.out.print("水：");
//        for (int j=0;j<100;j++) {
//            System.out.print(first_need_resource[0][j] + " ");
//        }
//        System.out.println("");
//        System.out.print("食物：");
//        for (int j=0;j<100;j++) {
//            System.out.print(first_need_resource[1][j] + " ");
//        }
//        System.out.println("");
//        System.out.println("第二次挖矿前资源购买分布：");
//        System.out.print("水：");
//        for (int j=0;j<100;j++) {
//            System.out.print(second_need_resource[0][j] + " ");
//        }
//        System.out.println("");
//        System.out.print("食物：");
//        for (int j=0;j<100;j++) {
//            System.out.print(second_need_resource[1][j] + " ");
//        }
//        System.out.println("");
//        System.out.println("回终点前资源购买分布：");
//        System.out.print("水：");
//        for (int j=0;j<100;j++) {
//            System.out.print(return_end_resource[0][j] + " ");
//        }
//        System.out.println("");
//        System.out.print("食物：");
//        for (int j=0;j<100;j++) {
//            System.out.print(return_end_resource[1][j]+" ");
//        }
//        System.out.println("");
//
//        /**购买资源约束线**/
//        int num_constraint = 0;
//        int i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (first_need_resource[0][j] <= max(first_need_resource[0])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("起点买水约束线："+(max(first_need_resource[0])-i));
//        num_constraint = 0;
//        i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (first_need_resource[1][j] <= max(first_need_resource[1])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("起点买食物约束线："+(max(first_need_resource[1])-i));
//        num_constraint = 0;
//        i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (second_need_resource[0][j] <= max(second_need_resource[0])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("第二次进矿买水约束线："+(max(second_need_resource[0])-i));
//        num_constraint = 0;
//        i=0;
//        for (;i<100;i++){
//            for (int j=0;j<100;j++){
//                if (second_need_resource[1][j] <= max(second_need_resource[1])-i) {
//                    num_constraint++;
//                }
//            }
//            if (num_constraint<=90){
//                break;
//            }
//            num_constraint=0;
//        }
//        System.out.println("第二次进矿买食物约束线："+(max(second_need_resource[1])-i));
//    }
//    public static int max(int[] num1){
//        int max = num1[0];
//        int len = num1.length;
//        for (int i = 1; i < len; i++) {
//            if(max<num1[i]){
//                num1[i] = num1[i] + max;
//                max = num1[i] - max;
//                num1[i] = num1[i] - max;
//            }
//        }
//        return max;
//    }
//    public static int min(int[] num2){
//        int min = num2[0];
//        int len = num2.length;
//        for (int i = 0; i < len; i++) {
//            if(min>num2[i]){
//                int t;
//                t = num2[i];
//                num2[i] = min;
//                min = t;
//            }
//        }
//        return min;
//    }
//}

/**2020年全国大学生数学建模竞赛B题第五题**/
//public class Math_model {
//    public static void main(String[] args) {
//        int heavy = 1200;
//        int day = 10;
//        int money = 10000;
//        int earn = 200;
//        int[] water = {3,5};
//        int[] food = {2,10};
//        int[] sun = {3,4};
//        int[] hot = {9,9};
//        int[] sand = {10,10};
//        int[] weather = {0,1,2,1,1,1,1,2,2,2,2};
//
//        /**我们先对单人行走收益最大化进行计算**/
//
//        /**线路1：最短路去终点**/
//
//        /**线路1情况下，高温是否等待**/
//
//        int day_begin_end=3;  /**此处原本最短路为3；**/
//        /**可更改可以更改最短路为：4，以预测行走四步到终点是否需要高温等待**/
//
//        int money_record_one_improve[] = new int[day];
//        int resources_record_one_improve[][] = new int[2][day];
//
//        int[] resources_one_improve = {0,0};
//        int go_day_one_improve = 1;
//
//        int wait_hot_day=0;
//        int wait_hot_cycle=day-day_begin_end;
//        for (;wait_hot_day<=wait_hot_cycle;wait_hot_day++) {
//            go_day_one_improve = 1;
//            resources_one_improve[0] = 0;
//            resources_one_improve[1] = 0;
//
//            int day_begin_end_improve = 3;  /**此处原本最短路为3；**/
//            /**可更改可以更改最短路为：4，以预测行走四步到终点是否需要高温等待**/
//            int wait_hot = 0;
//
//            for (; go_day_one_improve <= day_begin_end_improve; go_day_one_improve++) {
//                if (weather[go_day_one_improve]==1) {
//                    resources_one_improve[0] += sun[0] * 2;
//                    resources_one_improve[1] += sun[1] * 2;
//                } else if (weather[go_day_one_improve]==2) {
//                    if (wait_hot<wait_hot_day) {
//                        resources_one_improve[0] += hot[0];
//                        resources_one_improve[1] += hot[1];
//                        day_begin_end_improve++;
//                        wait_hot++;
//                    } else {
//                        resources_one_improve[0] += hot[0] * 2;
//                        resources_one_improve[1] += hot[1] * 2;
//                    }
//                }
//            }
//            money_record_one_improve[wait_hot_day] = money - resources_one_improve[0] * water[1] - resources_one_improve[1] * food[1];
//            resources_record_one_improve[0][wait_hot_day] = resources_one_improve[0];
//            resources_record_one_improve[1][wait_hot_day] = resources_one_improve[1];
//        }
//        /**最短路下最大剩余资金**/
//        System.out.println("最短路剩余资金分布：");
//        for (int i=0;i<wait_hot_day;i++) {
//            System.out.print(money_record_one_improve[i]+" ");
//        }
//        System.out.println("");
//        System.out.print("起点购买水物资数：");
//        System.out.println(resources_record_one_improve[0][1]);
//        System.out.print("起点购买食物物资数：");
//        System.out.println(resources_record_one_improve[1][1]);
//
//        /**线路2：最短路去矿山后再去终点**/
//
//        /**由第三关仿真模拟预测可知，线路2的一代最优为在矿山晴朗挖、高温走**/
//
//        /**则线路2的情况下，判断如遇连续晴朗，晴朗挖几天为最优解**/
//
//        int day_begin_mine = 3;
//        int day_mine_end = 2;
//        int day_begin_mine_end = day_begin_mine+day_mine_end;
//
//        int day_sun_mine = 0;
//
//        int money_record_two[] = new int[day];
//        int resources_record_two[][] = new int[2][day];
//        int record_num = day-day_begin_mine_end;
//        for (;day_sun_mine<=record_num;day_sun_mine++) {
//
//            int add_day=0;
//            int go_day_two = 1;
//            int[] resources_two = {0,0};
//
//            for (; go_day_two <= day_begin_mine; go_day_two++) {
//                if (weather[go_day_two] == 1) {
//                    resources_two[0] += sun[0] * 2;
//                    resources_two[1] += sun[1] * 2;
//                } else if (weather[go_day_two] == 2) {
//                    resources_two[0] += hot[0] * 2;
//                    resources_two[1] += hot[1] * 2;
//                }
//            }
//            int day_mineToEnd = go_day_two;
//
//            for (; go_day_two <= day_mineToEnd; go_day_two++) {
//                if (add_day==day_sun_mine) {
//                    break;
//                } else {
//                    if (weather[go_day_two] == 1) {
//                        resources_two[0] += sun[0] * 3;
//                        resources_two[1] += sun[1] * 3;
//                        money += earn;
//                        day_mineToEnd++;
//                        add_day++;
//                    } else if (weather[go_day_two] == 2) {
//                        break;
//                    }
//                }
//            }
//            int go_day_two_end = go_day_two + day_mine_end;
//            for (; go_day_two < go_day_two_end; go_day_two++) {
//                if (weather[go_day_two] == 1) {
//                    resources_two[0] += sun[0] * 2;
//                    resources_two[1] += sun[1] * 2;
//                } else if (weather[go_day_two] == 2) {
//                    resources_two[0] += hot[0] * 2;
//                    resources_two[1] += hot[1] * 2;
//                }
//            }
//            money_record_two[day_sun_mine] = money - resources_two[0] * water[1] - resources_two[1] * food[1];
//            resources_record_two[0][day_sun_mine] = resources_two[0];
//            resources_record_two[1][day_sun_mine] = resources_two[1];
//            money = 10000;
//        }
//
//        /**计算数据注释，需要可开**/
////        for (int j=0;j<=day_begin_mine_end;j++) {
////            System.out.println("晴朗挖矿天数："+j);
////            System.out.println(money_record_two[j]+" ");
////        }
//
//        /**通过上述两个线路最优解分析，我们再开始讨论两个人的操作情况**/
//        /**由题意我们知道，玩家前往终点时，应该尽可能保持相互分开的状态。**/
//        /**两人共同行走一段路的消耗，从题意知：相当于两人均在相同的天气的情况下多走了一天**/
//        /**通过地图的图解判断，玩家可以从另一个方向行走，最短路为4，两人路线并不重合**/
//        /**现对最短路4的讨论分析，是否需要高温等待，操作为上述最短路3的一个变量修改**/
//        /**分析得知选择步数4的最优解依旧是高温等待1天**/
//
//        /**收益判断**/
//        /**玩家存在三条路线**/
//        /**去矿山，收益最大化9325**/
//        /**去终点（较短路）-4步，收益最大化9425**/
//        /**去终点（最短路）-3步，收益最大化9535**/
//
//
//    }
//}

/**2020年全国大学生数学建模竞赛B题第六题**/
//public class Math_model {
//    public static void main(String[] args) {
//
//        /**目标明确：使得玩家三方收益尽可能平衡且最大化**/
//
//        /**当沙暴时，每个人都会停下行走，不影响前期的路线选择**/
//
//        /**路线选择（最优操作）：三个人分布流之，到达矿山、村庄形成的正方形圈的不同的三个点**/
//
//        /**采取完全信息动态博弈，以保证三人不会存在路线重合**/
//
//        /**最优操作确定：三人分别到达13(需要4步)、14（需要5步）、18（需要5步）**/
//
//        /**采取完全信息动态博弈，以保证三人不会存在路线重合**/
//        /**故一个人行走路线分配：1-2-3-4-9-14；1-6-11-16-17-18；1-1-2-7-8-13**/
//
//        /**到达指定点后，在以13、14、19、18形成的正方形圈，玩家顺时针或逆时针持续行走**/
//        /**以保证各玩家收益尽可能平衡（此刻三方收益最大差异为一次挖矿数收益差、回终点路线天数消耗差）**/
//
//        /**仿真模拟预测什么时候停止正方形圈循环**/
//
//        /**大收集装置**/
//
//        int[] go_village_day = new int[100];
//        int[][] go_village_resource = new int[2][100];
//        int[] first_mine_begin = new int[100];
//        int[] first_mine_end = new int[100];
//        int[] first_return_village_day = new int[100];
//        int[][] first_need_resource = new int[2][100];
//        int[] second_mine_begin = new int[100];
//        int[] second_mine_end = new int[100];
//        int[] second_return_villageOrEnd_day = new int[100];
//        int[][] second_need_resource = new int[2][100];
//        int[][] return_end_resource = new int[2][100];
//
//        int[] money_end = new int[100];
//        int[] come_supply = new int[100];
//        for (int num_simulation=0;num_simulation<100;num_simulation++) {
//
//            int heavy = 1200;
//            int day = 30;
//            int money = 10000;
//            int earn = 1000;
//            int[] water = {3, 5};
//            int[] food = {2, 10};
//            int[] sun = {3, 4};
//            int[] hot = {9, 9};
//            int[] sand = {10, 10};
//
//            /**此处如果依旧是第3问进行概率模拟，可能会出现极端情况**/
//            /**故我此次的天气模拟直接就是呈现6，9，15的随机分布模拟状况**/
//
//            /**天气分布模拟**/
//            int[] weather_reference = {2, 2, 1, 3, 1, 2, 3, 1, 2, 2, 3, 2, 1, 2, 2, 2, 3, 3, 2, 2, 1, 1, 2, 1, 3, 2, 1, 1, 2, 2};
//            int sun_num = 0;
//            int hot_num = 0;
//            int sand_num = 0;
//
//            int[] weather_list = new int[day];
//            int day_list = 0;  /**生成多少个随机数的变量**/
//            int list_count = 0;  /**生成day_list个随机数循环了几次**/
//            while (day_list < day) {
//                int random_num = (int) (Math.random() * day + 1);
//                list_count++;
//                for (int num_cycle = 0; num_cycle < day; num_cycle++) {
//
//                    if (weather_list[num_cycle] == random_num) {
//                        break;
//                    } else if (num_cycle == day_list) {
//                        weather_list[day_list] = random_num;
//                        day_list++;
//                        break;
//                    }
//                }
//            }
//
//
//            int[] weather_regroup = new int[day + 1];
//            weather_regroup[0] = 0;
//            for (int weather_day = 1; weather_day <= day; weather_day++) {
//                weather_regroup[weather_list[weather_day - 1]] = weather_reference[weather_day - 1];
//            }
//
//            int[] resources_begin = {0, 0};
//            int go_day = 1;
//            int day_toCircle = 5;   /**前往正方形圈需要5天**/
//
//            /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//            /**下面选择区域时必须注释掉不需要的区**/
//
//            /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//            /**前往18、14区**/
//
////            for (;go_day<=day_toCircle;go_day++){
////                if (weather_regroup[go_day] == 1) {
////                    resources_begin[0]+=sun[0]*2*water[0];
////                    resources_begin[1]+=sun[1]*2*food[0];
////                } else if (weather_regroup[go_day] == 2) {
////                    resources_begin[0]+=hot[0]*2*water[0];
////                    resources_begin[1]+=hot[1]*2*food[0];
////                } else if (weather_regroup[go_day] == 3) {
////                    resources_begin[0]+=sand[0]*water[0];
////                    resources_begin[1]+=sand[1]*food[0];
////                    day_toCircle++;
////                }
////            }
//
//            /**前往13区**/
//            for (;go_day<=day_toCircle;go_day++){
//                if (go_day==1){
//                    if (weather_regroup[go_day] == 1) {
//                        resources_begin[0] += sun[0]  * water[0];
//                        resources_begin[1] += sun[1]  * food[0];
//                    } else if (weather_regroup[go_day] == 2) {
//                        resources_begin[0] += hot[0]  * water[0];
//                        resources_begin[1] += hot[1]  * food[0];
//                    } else if (weather_regroup[go_day] == 3) {
//                        resources_begin[0] += sand[0] * water[0];
//                        resources_begin[1] += sand[1] * food[0];
//                        day_toCircle++;
//                    }
//                } else {
//                    if (weather_regroup[go_day] == 1) {
//                        resources_begin[0] += sun[0] * 2 * water[0];
//                        resources_begin[1] += sun[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day] == 2) {
//                        resources_begin[0] += hot[0] * 2 * water[0];
//                        resources_begin[1] += hot[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day] == 3) {
//                        resources_begin[0] += sand[0] * water[0];
//                        resources_begin[1] += sand[1] * food[0];
//                        day_toCircle++;
//                    }
//                }
//            }
//
//            go_village_day[num_simulation] = (go_day - 1);
//            go_village_resource[0][num_simulation] = resources_begin[0] / water[0];
//            go_village_resource[1][num_simulation] = resources_begin[1] / food[0];
//            /**已经所处正方形圈内**/
//            /**对13区所在玩家进行分析**/
//
//            int[] resources_mine_two = {0, 0};
//            int[] mine_village_second_resources = {0, 0};
//
//            int[] resources_mine_two_before = {0, 0};
//            int[] mine_village_second_resources_before = {0, 0};
//
//            int sum_day = 0;
//
//            int num_supply = 0;
//
//            int go_day_predict_second = 0;
//
//            /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//            /**下面选择区域时必须注释掉不需要的区**/
//
//            /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//            int[] min_short_road_end = {3,3,2,3,4}; /**13区**/
////            int[] min_short_road_end = {3,2,3,4,3}; /**18区**/
////            int[] min_short_road_end = {4,3,3,2,3}; /**14区**/
//
//            while ((go_day_predict_second - 1) <= day) {
//
//                if (go_day%min_short_road_end.length==3 && (go_day-1)%min_short_road_end.length==3) {
//                    if (weather_regroup[go_day] == 1) {
//                        resources_mine_two[0] += sun[0] * 3 * water[0];
//                        resources_mine_two[1] += sun[1] * 3 * food[0];
//                    } else if (weather_regroup[go_day] == 2) {
//                        resources_mine_two[0] += hot[0] * 3 * water[0];
//                        resources_mine_two[1] += hot[1] * 3 * food[0];
//                    } else if (weather_regroup[go_day] == 3) {
//                        resources_mine_two[0] += sand[0] * 3 * water[0];
//                        resources_mine_two[1] += sand[1] * 3 * food[0];
//                    }
//                } else {
//                    if (weather_regroup[go_day] == 1) {
//                        resources_mine_two[0] += sun[0] * 2 * water[0];
//                        resources_mine_two[1] += sun[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day] == 2) {
//                        resources_mine_two[0] += hot[0] * 2 * water[0];
//                        resources_mine_two[1] += hot[1] * 2 * food[0];
//                    } else if (weather_regroup[go_day] == 3) {
//                        resources_mine_two[0] += sand[0] * water[0];
//                        resources_mine_two[1] += sand[1] * food[0];
//                    }
//                }
//
//                /**初始化离开需要资源**/
//                mine_village_second_resources[0] = 0;
//                mine_village_second_resources[1] = 0;
//
//                /**回终点**/
//
//                go_day_predict_second = go_day+1;
//                int mine_village_second_day = go_day_predict_second + min_short_road_end[sum_day%min_short_road_end.length]; /**最短路需要未知**/
//                for (; go_day_predict_second < mine_village_second_day; go_day_predict_second++) {
//                    if (go_day_predict_second >= day) {
//                        continue;
//                    } else {
//                        if (weather_regroup[go_day_predict_second] == 1) {
//                            mine_village_second_resources[0] += sun[0] * 2 * water[0];
//                            mine_village_second_resources[1] += sun[1] * 2 * food[0];
//                        } else if (weather_regroup[go_day_predict_second] == 2) {
//                            mine_village_second_resources[0] += hot[0] * 2 * water[0];
//                            mine_village_second_resources[1] += hot[1] * 2 * food[0];
//                        } else if (weather_regroup[go_day_predict_second] == 3) {
//                            mine_village_second_resources[0] += sand[0] * water[0];
//                            mine_village_second_resources[1] += sand[1] * food[0];
//                            mine_village_second_day++;
//                        }
//                    }
//                }
//
//
//                /**前一天数据储存**/
//                if ((go_day_predict_second - 1) < day) {
//                    resources_mine_two_before[0] = resources_mine_two[0];
//                    resources_mine_two_before[1] = resources_mine_two[1];
//                    mine_village_second_resources_before[0] = mine_village_second_resources[0];
//                    mine_village_second_resources_before[1] = mine_village_second_resources[1];
//                    /**储存记录进村次数**/
//                    if (sum_day%min_short_road_end.length == 3 && (sum_day+1)%min_short_road_end.length == 4){
//                        num_supply ++;
//                    }
//                }
//                go_day++;
//                sum_day++;
//            }
//
//            come_supply[num_simulation] = num_supply;
//            second_mine_end[num_simulation] = (go_day - 2);
//            second_return_villageOrEnd_day[num_simulation] = (go_day_predict_second - 2);
//            second_need_resource[0][num_simulation] = resources_mine_two_before[0] / water[0];
//            second_need_resource[1][num_simulation] = resources_mine_two_before[1] / food[0];
//        }
//
//        /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//        /**下面选择区域时必须注释掉不需要的区**/
//
//        /**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%**/
//
//        System.out.println("13区预计离开循环天数统计：");
////        System.out.println("18区预计离开循环天数统计：");
////        System.out.println("14区预计离开循环天数统计：");
//        for (int i=0;i<100;i++){
//            System.out.print(second_mine_end[i]+" ");
//        }
//        System.out.println("");
//        System.out.println("前往13区需要水资源");
////        System.out.println("前往18区需要水资源：");
////        System.out.println("前往14区需要水资源：");
//        for (int i=0;i<100;i++){
//            System.out.print(go_village_resource[0][i]+" ");
//        }
//        System.out.println("");
//        System.out.println("前往13区需要食物资源");
////        System.out.println("前往18区需要食物资源：");
////        System.out.println("前往14区需要食物资源：");
//        for (int i=0;i<100;i++){
//            System.out.print(go_village_resource[1][i]+" ");
//        }
//        System.out.println("");
//        System.out.println("13区循环可补给次数");
////        System.out.println("18区循环可补给次数：");
////        System.out.println("14区循环可补给次数：");
//        for (int i=0;i<100;i++){
//            System.out.print(come_supply[i]+" ");
//        }
//        System.out.println("");
//        System.out.println("13区循环耗费水资源统计：");
////        System.out.println("18区循环耗费水资源统计：");
////        System.out.println("14区循环耗费水资源统计：");
//        for (int i=0;i<100;i++){
//            System.out.print(second_need_resource[0][i]+" ");
//        }
//        System.out.println("");
//        System.out.println("13区循环耗费食物资源统计：");
////        System.out.println("18区循环耗费食物资源统计：");
////        System.out.println("14区循环耗费食物资源统计：");
//        for (int i=0;i<100;i++){
//            System.out.print(second_need_resource[1][i]+" ");
//        }
//    }
//}

/**2021年美国大学生数学建模竞赛C题**/
// 数据预处理与得分
//import java.io.*;
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.regex.Pattern;
//import jxl.*;
//public class Math_model {
//    public static void main(String[] args) throws Exception{
//        // 待分类文件夹位置
//        String path="C:\\Users\\YeShenRen\\Desktop\\test\\2021";
//        // 获得文件夹内所有文件的具体文件路径
//        List<String> pic = getFiles(path);
//        String[] temp;
//        // 文件夹文件数量
//        int picSize = getFiles(path).size();
//        List<String> ver = new ArrayList<>();
//        // 获取每个文件的文件名
//        for (int i=0;i<picSize;i++){
//            temp = pic.get(i).split("\\\\");
//            ver.add(temp[temp.length-1]);
//        }
//        String[] verStr = new String[ver.size()];
//        // 将文件名的存储到数组中
//        for (int i=0;i<ver.size();i++){
//            verStr[i]=ver.get(i);
//        }
//        List<String> filename = new ArrayList<>();
//        List<String> lab = new ArrayList<>();
//        List<String> type = new ArrayList<>();
//        List<String> note = new ArrayList<>();
//        // 获取Excel文件的数据：文件名、分类标签、文件类型、描述语句
//        for (int k=1;k<5;k++) {
//            int numTable=1;
//            Sheet sheet;
//            Workbook book;
//            Cell cell1, cell3, cell4, cell5;
//            book = Workbook.getWorkbook(new File("C:\\Users\\YeShenRen\\Desktop\\test\\2020.xls"));
//            sheet = book.getSheet(k);
//            int jud = sheet.getRows();
//            for (int j = 0; j < jud - 1; j++) {
//                //获取每一行的单元格
//                cell1 = sheet.getCell(0, numTable);//（列，行）
//                cell3 = sheet.getCell(2, numTable);
//                cell4 = sheet.getCell(3, numTable);
//                cell5 = sheet.getCell(4, numTable);
//                filename.add(cell1.getContents());
//                lab.add(cell3.getContents());
//                type.add(cell4.getContents());
//                note.add(cell5.getContents());
//                numTable++;
//            }
//            book.close();
//        }
//
//        String[] filenameStr = new String[filename.size()];
//        // 将Excel数据中的文件名储存到数组中
//        for (int i=0;i<filename.size();i++){
//            filenameStr[i]=filename.get(i);
//        }
//        // 获得文件排序的索引
//        int[] filenameNum = sortToIndex(filenameStr);
//        // 文件分类数量：3194:negative  14:positive  11:unprocessed  86:unverified
//        String newLab;
//        // 文件分类，按标签分成4个文件夹
//        for (int i=0;i<picSize;i++){
//            newLab = lab.get(filenameNum[i])+"0000"+i;
//            testRenameFile(pic.get(i),newLab);
//        }
//        /**
//         * 描述语句期望特征
//         * 1.5 inches length   1.5-3英寸长
//         * yellow heads   黄色头部  orange 橙色
//         * black thorax    黑色胸部
//         * yellow black brown striped abdomens  黄色、黑色、棕色、条纹腹部；
//         * underground nests  地下筑巢
//         * 45cm length 45cm长
//         */
//        List<String> keyWord =  new ArrayList<>();
//        List<String> keyWordLayer =  new ArrayList<>();
//        List<Double> score = new ArrayList<>();
//        // 获取描述语句的期望特征，以及标签：有期望特征返回y，无则返回f
//        for (String a:note){
//            keyWord.add(getKeywords(a)[0]);
//            keyWordLayer.add(getKeywords(a)[1]);
//        }
//        // 对期望特征进行得分计算
//        score = getScore(keyWord,keyWordLayer);
//        // 获得有得分的描述语句的数量，以及没得分的数量
//        int noScore=0;
//        int haveScore=0;
//        for (double a:score){
//            if (a==0.0)
//                noScore++;
//            if (a!=0.0)
//                haveScore++;
//            System.out.println(a);
//        }
//    }
//    /**
//     * 重命名一个文件：将原来的文件重命名，并移动到指定文件夹
//     */
//    private static void testRenameFile(String filePath,String lab) {
////        String filePath = "C:\\Users\\YeShenRen\\Desktop\\test\\111.txt";
//        try {
//            File src = new File(filePath);
//            String[] ne = filePath.split("\\.");
//            String[] ne1 = ne[0].split("\\\\");
//            String newfile="";
//            for (int i=0;i<ne1.length-1;i++){
//                newfile+=ne1[i]+"\\";
//            }
//            String[] judge = {"Negative ID","Positive ID","Unprocessed","Unverified"};
//            if (lab.indexOf(judge[0])>=0)
//                newfile=newfile+judge[0]+"\\"+ne1[ne1.length-1]+".";
//            else if (lab.indexOf(judge[1])>=0)
//                newfile=newfile+judge[1]+"\\"+ne1[ne1.length-1]+".";
//            else if (lab.indexOf(judge[2])>=0)
//                newfile=newfile+judge[2]+"\\"+ne1[ne1.length-1]+".";
//            else if (lab.indexOf(judge[3])>=0)
//                newfile=newfile+judge[3]+"\\"+ne1[ne1.length-1]+".";
//            newfile+=ne[1];
//            File des = new File(newfile);
//            src.renameTo(des);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    /**
//     * 获取一个文件夹的所有文件名
//     */
//    public static List<String> getFiles(String path) {
//        List<String> files = new ArrayList<String>();
//        File file = new File(path);
//        File[] tempList = file.listFiles();
//
//        for (int i = 0; i < tempList.length; i++) {
//            if (tempList[i].isFile()) {
//                files.add(tempList[i].toString());
//                //文件名，不包含路径
//                //String fileName = tempList[i].getName();
//            }
//            if (tempList[i].isDirectory()) {
//                //这里就不递归了，
//            }
//        }
//        return files;
//    }
//    /**
//     * 对任意类型数组进行排序，但不改变原本数组，得到排序后数组的对应索引
//     */
//    public static <T> int[] sortToIndex(T[] v) {
//        Map<T, Queue<Integer>> indexMap = new HashMap<>();
//        for (int i=0; i<v.length; i++) {
//            Queue<Integer> indexes = indexMap.get(v[i]);
//            if (indexes == null)
//                indexes = new ArrayDeque<>();
//            indexes.add(i);
//            indexMap.put(v[i], indexes);
//        }
//        List<T> vSorted = Arrays.stream(v).sorted().collect(Collectors.toList());
//        int[] indexes = new int[vSorted.size()];
//        for (int i=0; i<vSorted.size(); i++) {
//            Queue<Integer> itemIndexes = indexMap.get(vSorted.get(i));
//            Integer index = itemIndexes.poll();
//            if (index == null)
//                throw new RuntimeException("itemIndexes为空");
//            indexes[i] = index;
//        }
//        return indexes;
//    }
//    /**
//     * 判断字符串是否为数字，可以是整数，小数
//     */
//    public static boolean isInteger(String str){
//        Pattern pattern = Pattern.compile("^[-\\+]?(\\d+\\.?\\d*)?$");
//        return pattern.matcher(str).matches();
//    }
//    /**
//     * 对字符串进行特征提取，按照字符串顺序返回特征字符串数组
//     */
//    public static String[] getKeywords(String sentence){
//        String sampleChat = "clypeus genaes eyes heads thorax abdomens nests location size inches lengths abdomens" +
//                " cleft wide black yellow orange black brown striped underground borrows pines roots trunks subterranean bigger stocky robust" +
//                " two three four five six seven nine long";
//        String other = "reddish hollows trees walls barns overhangs wells highers aerials lawns whites jackets";
//        String dealLower = sentence.toLowerCase();
//        String[] dealSplit = dealLower.split("(\\s+)");
//        String[] dealEnd = new String[2];
//        dealEnd[1] = "y";
//        dealEnd[0] = "";
//        for (String a:dealSplit){
//            if (sampleChat.indexOf(a)>=0 && a.length()>=3){
//                dealEnd[0]+=a+" ";
//            }
//            if (isInteger(a)){
//                dealEnd[0]+=a+" ";
//            }
//            if (other.indexOf(a)>=0 && a.length()>=4){
//                dealEnd[0]+=a+" ";
//                dealEnd[1] = "f";
//            }
//        }
//        if (dealEnd[0].length()<=0){
//            dealEnd[1] = "f";
//        }
//        return dealEnd;
//    }
//    /**
//     * 对字符串集进行特征得分计算
//     */
//    public static List<Double> getScore(List<String> keyWord, List<String>keyWordLayer){
//        List<Double> score = new ArrayList<>();
//        double interval = 0.03;
//        double scoreTemp;
//        int search;
//        boolean judge;
//        String keyWordTemp;
//        for (int i=0;i<keyWordLayer.size();i++){
//            scoreTemp = 0;
//            search = -1;
//            keyWordTemp = keyWord.get(i);
//            judge = true;
//            lin:if (keyWordLayer.get(i).equals("y")) {
//                if (keyWordTemp.indexOf("inch") >= 0)
//                    search = keyWordTemp.indexOf("inch");
//                else if (keyWordTemp.indexOf("long") >= 0)
//                    search = keyWordTemp.indexOf("long");
//                else if (keyWordTemp.indexOf("length") >= 0)
//                    search = keyWordTemp.indexOf("length");
//                if (search >= 0) {
//                    if (keyWordTemp.lastIndexOf("two", search) >= 0 || keyWordTemp.lastIndexOf("3", search) >= 0 ||
//                            keyWordTemp.lastIndexOf("2", search) >= 0 || keyWordTemp.lastIndexOf("1.75", search) >= 0 ||
//                            keyWordTemp.lastIndexOf("1.5", search) >= 0) {
//                        scoreTemp += interval;
//                    } else {}
//                }
//                search = -1;
//                if (keyWordTemp.indexOf("head") >= 0)
//                    search = keyWordTemp.indexOf("head");
//                if (search >= 0) {
//                    if (keyWordTemp.lastIndexOf("yellow", search) >= 0 || keyWordTemp.lastIndexOf("orange", search) >= 0) {
//                        scoreTemp += interval;
//                    } else {}
//                }
//                search = -1;
//                if (keyWordTemp.indexOf("thorax") >= 0)
//                    search = keyWordTemp.indexOf("thorax");
//                if (search >= 0) {
//                    if (keyWordTemp.lastIndexOf("black", search) >= 0) {
//                        scoreTemp += interval;
//                    } else {}
//                }
//                search = -1;
//                if (keyWordTemp.indexOf("abdomens") >= 0)
//                    search = keyWordTemp.indexOf("abdomens");
//                if (search >= 0) {
//                    if (keyWordTemp.lastIndexOf("yellow", search) >= 0 || keyWordTemp.lastIndexOf("black", search) >= 0 || keyWordTemp.lastIndexOf("brown", search) >= 0) {
//                        if (keyWordTemp.lastIndexOf("striped", search) >= 0) {
//                            scoreTemp += interval;
//                        } else {}
//                    } else {}
//                }
//                search = -1;
//                if (keyWordTemp.indexOf("nest") >= 0){
//                    if (keyWordTemp.indexOf("underground") >= 0||keyWordTemp.indexOf("borrow") >= 0||keyWordTemp.indexOf("pine") >= 0||
//                            keyWordTemp.indexOf("root") >= 0||keyWordTemp.indexOf("trunk") >= 0||keyWordTemp.indexOf("subterranean") >= 0) {
//                        scoreTemp += interval;
//                    } else {}
//                }else {}
//                score.add(scoreTemp);
//            }else {
//                score.add(0.0);
//            }
//        }
//        return score;
//    }
//}
// 数据7/3分训练集测试机
//import java.io.*;
//import java.util.*;
//public class Math_model {
//    public static void main(String[] args) {
//        String path="C:\\Users\\YeShenRen\\Desktop\\ggg\\changsize\\Positive ID";
//        List<String> pic = getFiles(path);
//        int picSize = getFiles(path).size();
//        String newLab;
//        for (int i=0;i<picSize;i++){
//            newLab = "Positive00"+i;
//            testRenameFile(pic.get(i),newLab);
//        }
//    }
//    private static void testRenameFile(String filePath,String lab) {
//        try {
//            File src = new File(filePath);
//            String[] ne = filePath.split("\\.");
//            String[] ne1 = ne[0].split("\\\\");
//            String newfile="";
//            for (int i=0;i<ne1.length-1;i++){
//                newfile+=ne1[i]+"\\";
//            }
//            newfile = newfile + "7\\" + lab+".";
//            newfile+=ne[1];
//            File des = new File(newfile);
//            src.renameTo(des);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static List<String> getFiles(String path) {
//        List<String> files = new ArrayList<String>();
//        File file = new File(path);
//        File[] tempList = file.listFiles();
//
//        for (int i = 0; i < tempList.length; i++) {
//            if (tempList[i].isFile()) {
//                files.add(tempList[i].toString());
//                //文件名，不包含路径
//                //String fileName = tempList[i].getName();
//            }
//            if (tempList[i].isDirectory()) {
//                //这里就不递归了，
//            }
//        }
//        return files;
//    }
//}
