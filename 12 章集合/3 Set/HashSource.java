package 集合.Set_;/*
 *@author yang
 */

import java.util.HashSet;

public class HashSource {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);
        /*
          1 public HashSet() {
                map = new HashMap<>();
             }
          2 执行add方法
            public boolean add(E e) {
                return map.put(e, PRESENT)==null;
            }
          3 执行put() 该方法会执行hash(key) 得到key对应的hash值
          public V put(K key, V value) { //key="java" value = PRESENT 共享
            return putVal(hash(key), key, value, false, true);
          }
          4 执行putVal
          final V putVal(int hash, K key, V value, boolean onlyIfAbsent,boolean evict) {
            Node<K,V>[] tab; Node<K,V> p; int n, i;  //定义了辅助变量
            //table就是HashMap的一个数组，类型是Node[]
            //if语句表示如果当前table是null，或者大小为0，就第一次扩容，到16个空间


            if ((tab = table) == null || (n = tab.length) == 0)
            n = (tab = resize()).length;

            //1.根据key，得到hash 去计算该key应该存放到table表哪个索引位置
            //并且把这个位置的对象赋给p
            //2.判断p是否为null
            //如果p为null，表示还没有存放元素，就创建了一个Node(key,value)
            //就放在该位置 tab[i] = newNode(hash, key, value, null);

            if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
            else {
                Node<K,V> e; K k;

                如果当前索引位置对应的链表的第一个元素和准备添加的key和hash值一样
                并且满足一下两个条件之一
                准备加入的key和p指向的Node结点的key是同一个对象
                p指向Node结点的 key的equals方法和准备加入的key比较后执行相同
                就不能加入



            if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;

                //判断p是不是红黑树
                如果是红黑树，就调用putTreeVal，来进行添加


            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else { //
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount; 每加入一个结点Node（k,v,h,next),size++
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
    }

        * */
    }
}
